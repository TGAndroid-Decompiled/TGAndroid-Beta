package org.webrtc;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
abstract class CameraCapturer implements CameraVideoCapturer {
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private static final String TAG = "CameraCapturer";
    private Context applicationContext;
    private final CameraEnumerator cameraEnumerator;
    private String cameraName;
    private CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    private CapturerObserver capturerObserver;
    private CameraSession currentSession;
    private final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private boolean firstFrameObserved;
    private int framerate;
    private int height;
    private int openAttemptsRemaining;
    private String pendingCameraName;
    private boolean sessionOpening;
    private SurfaceTextureHelper surfaceHelper;
    private CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    private final Handler uiThreadHandler;
    private int width;
    private final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() {
        @Override
        public void onDone(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            Logging.d("CameraCapturer", "Create session done. Switch state: " + CameraCapturer.this.switchState);
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                CameraCapturer.this.sessionOpening = false;
                CameraCapturer.this.currentSession = cameraSession;
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                CameraCapturer.this.firstFrameObserved = false;
                CameraCapturer.this.stateLock.notifyAll();
                SwitchState switchState = CameraCapturer.this.switchState;
                SwitchState switchState2 = SwitchState.IN_PROGRESS;
                CameraCapturer cameraCapturer2 = CameraCapturer.this;
                if (switchState == switchState2) {
                    cameraCapturer2.switchState = SwitchState.IDLE;
                    if (CameraCapturer.this.switchEventsHandler != null) {
                        CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                        CameraCapturer.this.switchEventsHandler = null;
                    }
                } else if (cameraCapturer2.switchState == SwitchState.PENDING) {
                    String str = CameraCapturer.this.pendingCameraName;
                    CameraCapturer.this.pendingCameraName = null;
                    CameraCapturer.this.switchState = SwitchState.IDLE;
                    CameraCapturer cameraCapturer3 = CameraCapturer.this;
                    cameraCapturer3.switchCameraInternal(cameraCapturer3.switchEventsHandler, str);
                }
            }
        }

        @Override
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.openAttemptsRemaining--;
                if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                    Logging.w("CameraCapturer", "Opening camera failed, passing: " + str);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    SwitchState switchState = CameraCapturer.this.switchState;
                    SwitchState switchState2 = SwitchState.IDLE;
                    if (switchState != switchState2) {
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                        CameraCapturer.this.switchState = switchState2;
                    }
                    CameraSession.FailureType failureType2 = CameraSession.FailureType.DISCONNECTED;
                    CameraCapturer cameraCapturer2 = CameraCapturer.this;
                    if (failureType == failureType2) {
                        cameraCapturer2.eventsHandler.onCameraDisconnected();
                    } else {
                        cameraCapturer2.eventsHandler.onCameraError(str);
                    }
                } else {
                    Logging.w("CameraCapturer", "Opening camera failed, retry: " + str);
                    CameraCapturer.this.createSessionInternal(500);
                }
            }
        }
    };
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() {
        @Override
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession && CameraCapturer.this.currentSession != null) {
                    Logging.d("CameraCapturer", "onCameraClosed from another session.");
                } else {
                    CameraCapturer.this.eventsHandler.onCameraClosed();
                }
            }
        }

        @Override
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.w("CameraCapturer", "onCameraDisconnected from another session.");
                    return;
                }
                CameraCapturer.this.eventsHandler.onCameraDisconnected();
                CameraCapturer.this.stopCapture();
            }
        }

        @Override
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.w("CameraCapturer", "onCameraError from another session: " + str);
                    return;
                }
                CameraCapturer.this.eventsHandler.onCameraError(str);
                CameraCapturer.this.stopCapture();
            }
        }

        @Override
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (CameraCapturer.this.currentSession != null) {
                    Logging.w("CameraCapturer", "onCameraOpening while session was open.");
                } else {
                    CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                }
            }
        }

        @Override
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                if (cameraSession != CameraCapturer.this.currentSession) {
                    Logging.w("CameraCapturer", "onFrameCaptured from another session.");
                    return;
                }
                if (!CameraCapturer.this.firstFrameObserved) {
                    CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                    CameraCapturer.this.firstFrameObserved = true;
                }
                CameraCapturer.this.cameraStatistics.addFrame();
                CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
            }
        }
    };
    private final Runnable openCameraTimeoutRunnable = new Runnable() {
        @Override
        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    private final Object stateLock = new Object();
    private SwitchState switchState = SwitchState.IDLE;

    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() {
            @Override
            public void onCameraClosed() {
            }

            @Override
            public void onCameraDisconnected() {
            }

            @Override
            public void onFirstFrameAvailable() {
            }

            @Override
            public void onCameraError(String str2) {
            }

            @Override
            public void onCameraFreezed(String str2) {
            }

            @Override
            public void onCameraOpening(String str2) {
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator;
        this.cameraName = str;
        List asList = Arrays.asList(cameraEnumerator.getDeviceNames());
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        if (!asList.isEmpty()) {
            if (asList.contains(this.cameraName)) {
                return;
            }
            lq5.j(c00.k(new StringBuilder("Camera name "), this.cameraName, " does not match any known camera device."));
            throw null;
        }
        xi4.l("No cameras attached.");
        throw null;
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        Logging.e("CameraCapturer", "Check is on camera thread failed.");
        xi4.l("Not on camera thread.");
    }

    public void createSessionInternal(int i) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i + 10000);
        this.cameraThreadHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
            }
        }, i);
    }

    public void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.e("CameraCapturer", str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        Logging.d("CameraCapturer", "switchCamera internal");
        if (!Arrays.asList(this.cameraEnumerator.getDeviceNames()).contains(str)) {
            reportCameraSwitchError(c00.i("Attempted to switch to unknown camera device ", str), cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            if (this.switchState != SwitchState.IDLE) {
                reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                return;
            }
            boolean z = this.sessionOpening;
            if (!z && this.currentSession == null) {
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                return;
            }
            this.switchEventsHandler = cameraSwitchHandler;
            if (z) {
                this.switchState = SwitchState.PENDING;
                this.pendingCameraName = str;
                return;
            }
            this.switchState = SwitchState.IN_PROGRESS;
            Logging.d("CameraCapturer", "switchCamera: Stopping session");
            this.cameraStatistics.release();
            this.cameraStatistics = null;
            final CameraSession cameraSession = this.currentSession;
            this.cameraThreadHandler.post(new Runnable() {
                @Override
                public void run() {
                    cameraSession.stop();
                }
            });
            this.currentSession = null;
            this.cameraName = str;
            this.sessionOpening = true;
            this.openAttemptsRemaining = 1;
            createSessionInternal(0);
            Logging.d("CameraCapturer", "switchCamera done");
        }
    }

    @Override
    public final void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @Override
    public void changeCaptureFormat(int i, int i2, int i3) {
        StringBuilder p = bs2.p("changeCaptureFormat: ", i, "x", i2, "@");
        p.append(i3);
        Logging.d("CameraCapturer", p.toString());
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i, i2, i3);
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3);

    @Override
    public void dispose() {
        Logging.d("CameraCapturer", "dispose");
        stopCapture();
    }

    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    @Override
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.applicationContext = context;
        this.capturerObserver = capturerObserver;
        this.surfaceHelper = surfaceTextureHelper;
        this.cameraThreadHandler = surfaceTextureHelper.getHandler();
    }

    @Override
    public boolean isCapturing() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.sessionOpening && this.currentSession == null) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    @Override
    public boolean isScreencast() {
        return false;
    }

    public void printStackTrace() {
        Thread thread;
        Handler handler = this.cameraThreadHandler;
        if (handler != null) {
            thread = handler.getLooper().getThread();
        } else {
            thread = null;
        }
        if (thread != null) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.d("CameraCapturer", "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.d("CameraCapturer", stackTraceElement.toString());
                }
            }
        }
    }

    @Override
    public final void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        throw new UnsupportedOperationException("Deprecated and not implemented.");
    }

    @Override
    public void startCapture(int i, int i2, int i3) {
        StringBuilder p = bs2.p("startCapture: ", i, "x", i2, "@");
        p.append(i3);
        Logging.d("CameraCapturer", p.toString());
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (!this.sessionOpening && this.currentSession == null) {
                    this.width = i;
                    this.height = i2;
                    this.framerate = i3;
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 3;
                    createSessionInternal(0);
                    return;
                }
                Logging.w("CameraCapturer", "Session already open");
                return;
            }
        }
        xi4.l("CameraCapturer must be initialized before calling startCapture.");
    }

    @Override
    public void stopCapture() {
        Logging.d("CameraCapturer", "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                Logging.d("CameraCapturer", "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    Logging.w("CameraCapturer", "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                Logging.d("CameraCapturer", "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                Logging.d("CameraCapturer", "Stop capture: No session open");
            }
        }
        Logging.d("CameraCapturer", "Stop capture done");
    }

    @Override
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        Logging.d("CameraCapturer", "switchCamera");
        this.cameraThreadHandler.post(new Runnable() {
            @Override
            public void run() {
                List asList = Arrays.asList(CameraCapturer.this.cameraEnumerator.getDeviceNames());
                int size = asList.size();
                CameraCapturer cameraCapturer = CameraCapturer.this;
                if (size < 2) {
                    cameraCapturer.reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
                    return;
                }
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, (String) asList.get((asList.indexOf(cameraCapturer.cameraName) + 1) % asList.size()));
            }
        });
    }

    @Override
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, final String str) {
        Logging.d("CameraCapturer", "switchCamera");
        this.cameraThreadHandler.post(new Runnable() {
            @Override
            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, str);
            }
        });
    }
}
