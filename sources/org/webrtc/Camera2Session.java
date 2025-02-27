package org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.Camera2Session;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.VideoSink;

public class Camera2Session implements CameraSession {
    private static final String TAG = "Camera2Session";
    private final Context applicationContext;
    private final CameraSession.CreateSessionCallback callback;
    private CameraCharacteristics cameraCharacteristics;
    private CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    private int cameraOrientation;
    private final Handler cameraThreadHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;
    private CameraCaptureSession captureSession;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int framerate;
    private final int height;
    private boolean isCameraFrontFacing;
    private OrientationHelper orientationHelper;
    private SessionState state = SessionState.RUNNING;
    private Surface surface;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;
    private static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, 10000, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, 10000, 50);
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    private static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        private CameraCaptureCallback() {
        }

        @Override
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Logging.d("Camera2Session", "Capture failed: " + captureFailure);
        }
    }

    public class CameraStateCallback extends CameraDevice.StateCallback {
        private CameraStateCallback() {
        }

        private String getErrorDescription(int i) {
            if (i == 1) {
                return "Camera device is in use already.";
            }
            if (i == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i == 4) {
                return "Camera device has encountered a fatal error.";
            }
            if (i == 5) {
                return "Camera service has encountered a fatal error.";
            }
            return "Unknown camera error: " + i;
        }

        @Override
        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.d("Camera2Session", "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        @Override
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z = Camera2Session.this.captureSession == null && Camera2Session.this.state != SessionState.STOPPED;
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            if (z) {
                Camera2Session.this.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        @Override
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i));
        }

        @Override
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.d("Camera2Session", "Camera opened.");
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            cameraDevice.createCaptureSession(Arrays.asList(Camera2Session.this.surface), new CaptureSessionCallback(), Camera2Session.this.cameraThreadHandler);
        }
    }

    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        private CaptureSessionCallback() {
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            CameraCharacteristics.Key key;
            Object obj;
            String str;
            CaptureRequest.Key key2;
            CameraCharacteristics cameraCharacteristics = Camera2Session.this.cameraCharacteristics;
            key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            obj = cameraCharacteristics.get(key);
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "Auto-focus is not available.";
                    break;
                } else {
                    if (iArr[i] == 3) {
                        key2 = CaptureRequest.CONTROL_AF_MODE;
                        builder.set(key2, 3);
                        str = "Using continuous video auto-focus.";
                        break;
                    }
                    i++;
                }
            }
            Logging.d("Camera2Session", str);
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            CameraCharacteristics.Key key;
            Object obj;
            CameraCharacteristics.Key key2;
            Object obj2;
            String str;
            CaptureRequest.Key key3;
            CaptureRequest.Key key4;
            CaptureRequest.Key key5;
            CaptureRequest.Key key6;
            CameraCharacteristics cameraCharacteristics = Camera2Session.this.cameraCharacteristics;
            key = CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION;
            obj = cameraCharacteristics.get(key);
            int[] iArr = (int[]) obj;
            int i = 0;
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 1) {
                        key5 = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
                        builder.set(key5, 1);
                        key6 = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
                        builder.set(key6, 0);
                        str = "Using optical stabilization.";
                        break;
                    }
                }
            }
            CameraCharacteristics cameraCharacteristics2 = Camera2Session.this.cameraCharacteristics;
            key2 = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
            obj2 = cameraCharacteristics2.get(key2);
            int[] iArr2 = (int[]) obj2;
            int length = iArr2.length;
            while (true) {
                if (i >= length) {
                    str = "Stabilization not available.";
                    break;
                }
                if (iArr2[i] == 1) {
                    key3 = CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
                    builder.set(key3, 1);
                    key4 = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
                    builder.set(key4, 0);
                    str = "Using video stabilization.";
                    break;
                }
                i++;
            }
            Logging.d("Camera2Session", str);
        }

        public void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                Logging.d("Camera2Session", "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            VideoFrame videoFrame2 = new VideoFrame(CameraSession.CC.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            CaptureRequest.Builder createCaptureRequest;
            CaptureRequest.Key key;
            CaptureRequest.Key key2;
            CaptureRequest.Key key3;
            CaptureRequest build;
            Camera2Session.this.checkIsOnCameraThread();
            Logging.d("Camera2Session", "Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            createCaptureRequest = Camera2Session.this.cameraDevice.createCaptureRequest(3);
            key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            createCaptureRequest.set(key, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
            key2 = CaptureRequest.CONTROL_AE_MODE;
            createCaptureRequest.set(key2, 1);
            key3 = CaptureRequest.CONTROL_AE_LOCK;
            createCaptureRequest.set(key3, Boolean.FALSE);
            chooseStabilizationMode(createCaptureRequest);
            chooseFocusMode(createCaptureRequest);
            createCaptureRequest.addTarget(Camera2Session.this.surface);
            build = createCaptureRequest.build();
            cameraCaptureSession.setRepeatingRequest(build, new CameraCaptureCallback(), Camera2Session.this.cameraThreadHandler);
            Camera2Session.this.surfaceTextureHelper.startListening(new VideoSink() {
                @Override
                public final void onFrame(VideoFrame videoFrame) {
                    Camera2Session.CaptureSessionCallback.this.lambda$onConfigured$0(videoFrame);
                }

                @Override
                public void setParentSink(VideoSink videoSink) {
                    VideoSink.CC.$default$setParentSink(this, videoSink);
                }
            });
            Logging.d("Camera2Session", "Camera device successfully started.");
            Camera2Session.this.callback.onDone(Camera2Session.this);
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Logging.d("Camera2Session", "Create new camera2 session on camera " + str);
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i;
        this.height = i2;
        this.framerate = i3;
        this.orientationHelper = new OrientationHelper();
        start();
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i, i2, i3);
    }

    private void findCaptureFormat() {
        CameraCharacteristics.Key key;
        Object obj;
        checkIsOnCameraThread();
        CameraCharacteristics cameraCharacteristics = this.cameraCharacteristics;
        key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        obj = cameraCharacteristics.get(key);
        Range[] rangeArr = (Range[]) obj;
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        Logging.d("Camera2Session", "Available preview sizes: " + supportedSizes);
        Logging.d("Camera2Session", "Available fps ranges: " + convertFramerates);
        if (convertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(convertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        Logging.d("Camera2Session", "Using capture format: " + this.captureFormat);
    }

    public int getFrameOrientation() {
        int orientation = this.orientationHelper.getOrientation();
        OrientationHelper.cameraOrientation = orientation;
        if (this.isCameraFrontFacing) {
            orientation = 360 - orientation;
        }
        OrientationHelper.cameraRotation = orientation;
        return (this.cameraOrientation + orientation) % 360;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        Logging.d("Camera2Session", "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(), this.cameraThreadHandler);
        } catch (Exception e) {
            reportError("Failed to open camera: " + e);
        }
    }

    public void reportError(String str) {
        checkIsOnCameraThread();
        Logging.e("Camera2Session", "Error: " + str);
        boolean z = this.captureSession == null && this.state != SessionState.STOPPED;
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    private void start() {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Object obj;
        CameraCharacteristics.Key key2;
        Object obj2;
        checkIsOnCameraThread();
        Logging.d("Camera2Session", "start");
        try {
            cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.orientationHelper.start();
            CameraCharacteristics cameraCharacteristics2 = this.cameraCharacteristics;
            key = CameraCharacteristics.SENSOR_ORIENTATION;
            obj = cameraCharacteristics2.get(key);
            this.cameraOrientation = ((Integer) obj).intValue();
            CameraCharacteristics cameraCharacteristics3 = this.cameraCharacteristics;
            key2 = CameraCharacteristics.LENS_FACING;
            obj2 = cameraCharacteristics3.get(key2);
            this.isCameraFrontFacing = ((Integer) obj2).intValue() == 0;
            findCaptureFormat();
            openCamera();
        } catch (Throwable th) {
            reportError("getCameraCharacteristics(): " + th.getMessage());
        }
    }

    public void stopInternal() {
        Logging.d("Camera2Session", "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        OrientationHelper orientationHelper = this.orientationHelper;
        if (orientationHelper != null) {
            orientationHelper.stop();
        }
        Logging.d("Camera2Session", "Stop done");
    }

    @Override
    public void stop() {
        Logging.d("Camera2Session", "Stop camera2 session on camera " + this.cameraId);
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long nanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
        }
    }
}
