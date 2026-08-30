package org.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kh.a2;
import nh.e1;
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
    private OrientationHelper orientationHelper;
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
            Camera1Session.this.cameraThreadHandler.post(new b(this, bArr, 1));
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
                    Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                    Camera1Session.this.firstFrameReported = true;
                }
                VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new b(this, bArr, 0)), Camera1Session.this.getFrameOrientation(), nanos);
                Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
                videoFrame.release();
            }
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events, boolean z4, Context context, SurfaceTextureHelper surfaceTextureHelper, int i10, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j10) {
        Logging.d("Camera1Session", "Create new camera1 session on camera " + i10);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z4;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i10;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j10;
        this.orientationHelper = new OrientationHelper();
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("Wrong thread");
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z4, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12) {
        long nanoTime = System.nanoTime();
        Logging.d("Camera1Session", "Open camera " + str);
        events.onCameraOpening();
        try {
            int cameraIndex = Camera1Enumerator.getCameraIndex(str);
            try {
                Camera open = Camera.open(cameraIndex);
                if (open == null) {
                    CameraSession.FailureType failureType = CameraSession.FailureType.ERROR;
                    createSessionCallback.onFailure(failureType, "Camera.open returned null for camera id = " + cameraIndex);
                    return;
                }
                try {
                    open.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(cameraIndex, cameraInfo);
                    try {
                        Camera.Parameters parameters = open.getParameters();
                        CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat = findClosestCaptureFormat(parameters, i10, i11, i12);
                        updateCameraParameters(open, parameters, findClosestCaptureFormat, findClosestPictureSize(parameters, i10, i11), z4);
                        if (!z4) {
                            int frameSize = findClosestCaptureFormat.frameSize();
                            for (int i13 = 0; i13 < 3; i13++) {
                                open.addCallbackBuffer(ByteBuffer.allocateDirect(frameSize).array());
                            }
                        }
                        try {
                            open.setDisplayOrientation(0);
                            createSessionCallback.onDone(new Camera1Session(events, z4, context, surfaceTextureHelper, cameraIndex, open, cameraInfo, findClosestCaptureFormat, nanoTime));
                        } catch (RuntimeException e) {
                            open.release();
                            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e.getMessage());
                        }
                    } catch (RuntimeException e6) {
                        open.release();
                        createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e6.getMessage());
                    }
                } catch (IOException | RuntimeException e10) {
                    open.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e10.getMessage());
                }
            } catch (RuntimeException e11) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e11.getMessage());
            }
        } catch (IllegalArgumentException e12) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e12.getMessage());
        }
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i10, int i11, int i12) {
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.d("Camera1Session", "Available fps ranges: " + convertFramerates);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, i12);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i10, i11);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i10, int i11) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i10, i11);
    }

    public int getFrameOrientation() {
        int orientation;
        if (e1.T != null) {
            orientation = 0;
        } else {
            orientation = this.orientationHelper.getOrientation();
        }
        OrientationHelper.cameraOrientation = orientation;
        if (this.info.facing == 1) {
            orientation = 360 - orientation;
        }
        OrientationHelper.cameraRotation = orientation;
        return (this.info.orientation + orientation) % 360;
    }

    public void lambda$listenForTextureFrames$0(VideoFrame videoFrame) {
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            Logging.d("Camera1Session", "Texture frame captured but camera is no longer running.");
            return;
        }
        boolean z4 = true;
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        TextureBufferImpl textureBufferImpl = (TextureBufferImpl) videoFrame.getBuffer();
        if (this.info.facing != 1) {
            z4 = false;
        }
        VideoFrame videoFrame2 = new VideoFrame(c.a(textureBufferImpl, z4, 0), getFrameOrientation(), videoFrame.getTimestampNs());
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new AnonymousClass2());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new a(this, 0));
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
            public void onError(int i10, Camera camera) {
                String j10;
                if (i10 == 100) {
                    j10 = "Camera server died!";
                } else {
                    j10 = a2.j(i10, "Camera error: ");
                }
                Logging.e("Camera1Session", j10);
                Camera1Session.this.stopInternal();
                if (i10 == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, j10);
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
        OrientationHelper orientationHelper = this.orientationHelper;
        if (orientationHelper != null) {
            orientationHelper.stop();
        }
        Logging.d("Camera1Session", "Stop done");
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z4) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z4) {
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
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }
}
