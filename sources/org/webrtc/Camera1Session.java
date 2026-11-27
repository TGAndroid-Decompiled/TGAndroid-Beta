package org.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
public class Camera1Session implements CameraSession {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private final Context applicationContext;
    private final Camera camera;
    private final int cameraId;
    private final Handler cameraThreadHandler;
    private final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private final Camera.CameraInfo info;
    private SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, 10000, 50);
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    public class AnonymousClass2 implements Camera.PreviewCallback {
        public AnonymousClass2() {
            Camera1Session.this = r1;
        }

        public void lambda$onPreviewFrame$0(byte[] bArr) {
            if (Camera1Session.this.state == SessionState.RUNNING) {
                Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        public void lambda$onPreviewFrame$1(byte[] bArr) {
            Camera1Session.this.cameraThreadHandler.post(new b(this, bArr, (byte) 1));
        }

        @Override
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Camera1Session.this.checkIsOnCameraThread();
            if (camera != Camera1Session.this.camera) {
                Logging.e("Camera1Session", "Callback from a different camera. This should never happen.");
            } else if (Camera1Session.this.state != SessionState.RUNNING) {
                Logging.d("Camera1Session", "Bytebuffer frame captured but camera is no longer running.");
            } else {
                long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                if (!Camera1Session.this.firstFrameReported) {
                    Camera1Session.camera1StartTimeMsHistogram.addSample((int) ((System.nanoTime() - Camera1Session.this.constructionTimeNs) / 1000000));
                    Camera1Session.this.firstFrameReported = true;
                }
                VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new b(this, bArr, (byte) 0)), Camera1Session.this.getFrameOrientation(), nanos);
                Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                videoFrame.release();
            }
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper, int i, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j) {
        Logging.d("Camera1Session", "Create new camera1 session on camera " + i);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        grb.i("Wrong thread");
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        long nanoTime = System.nanoTime();
        Logging.d("Camera1Session", "Open camera " + str);
        events.onCameraOpening();
        try {
            int cameraIndex = Camera1Enumerator.getCameraIndex(str);
            try {
                Camera open = Camera.open(cameraIndex);
                if (open == null) {
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "Camera.open returned null for camera id = " + cameraIndex);
                    return;
                }
                try {
                    open.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(cameraIndex, cameraInfo);
                    try {
                        Camera.Parameters parameters = open.getParameters();
                        CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i, i2, i3);
                        updateCameraParameters(open, parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, i, i2), z);
                        if (!z) {
                            int frameSize = findClosestCaptureFormat.frameSize();
                            for (int i4 = 0; i4 < 3; i4++) {
                                open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                            }
                        }
                        try {
                            open.setDisplayOrientation(0);
                            createSessionCallback.onDone(new Camera1Session(events, z, context, surfaceTextureHelper, cameraIndex, open, cameraInfo, findClosestCaptureFormat, nanoTime));
                        } catch (RuntimeException e) {
                            open.release();
                            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                        }
                    } catch (RuntimeException e2) {
                        open.release();
                        createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e2.getMessage());
                    }
                } catch (IOException | RuntimeException e3) {
                    open.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e3.getMessage());
                }
            } catch (RuntimeException e4) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e4.getMessage());
            }
        } catch (IllegalArgumentException e5) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e5.getMessage());
        }
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i, int i2, int i3) {
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.d("Camera1Session", "Available fps ranges: " + convertFramerates);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i3);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i, i2);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i, int i2) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i, i2);
    }

    public int getFrameOrientation() {
        int b = c00.b(this.applicationContext);
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 0) {
            b = 360 - b;
        }
        return (cameraInfo.orientation + b) % 360;
    }

    public void lambda$listenForTextureFrames$0(VideoFrame videoFrame) {
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            Logging.d("Camera1Session", "Texture frame captured but camera is no longer running.");
            return;
        }
        boolean z = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) ((System.nanoTime() - this.constructionTimeNs) / 1000000));
            this.firstFrameReported = true;
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) videoFrame.getBuffer();
        if (this.info.facing != 1) {
            z = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(c00.a(textureBufferImpl, z, 0), getFrameOrientation(), videoFrame.getTimestampNs());
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new AnonymousClass2());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new a(this, (byte) 0));
    }

    private void startCapturing() {
        Logging.d("Camera1Session", "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() {
            {
                Camera1Session.this = this;
            }

            @Override
            public void onError(int i, Camera camera) {
                String k;
                if (i == 100) {
                    k = "Camera server died!";
                } else {
                    k = uh9.k(i, "Camera error: ");
                }
                Logging.e("Camera1Session", k);
                Camera1Session.this.stopInternal();
                Camera1Session camera1Session = Camera1Session.this;
                if (i == 2) {
                    camera1Session.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    camera1Session.events.onCameraError(Camera1Session.this, k);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e) {
            stopInternal();
            this.events.onCameraError(this, e.getMessage());
        }
    }

    public void stopInternal() {
        Logging.d("Camera1Session", "Stop internal");
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            Logging.d("Camera1Session", "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        this.camera.stopPreview();
        this.camera.release();
        this.events.onCameraClosed(this);
        Logging.d("Camera1Session", "Stop done");
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    @Override
    public void stop() {
        Logging.d("Camera1Session", "Stop camera1 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long nanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) ((System.nanoTime() - nanoTime) / 1000000));
        }
    }
}
