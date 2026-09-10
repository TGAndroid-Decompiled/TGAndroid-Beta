package org.webrtc;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Cells.r6;
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
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.currentSession = cameraSession;
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.cameraStatistics = new CameraVideoCapturer.CameraStatistics(cameraCapturer.surfaceHelper, CameraCapturer.this.eventsHandler);
                    CameraCapturer.this.firstFrameObserved = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                    } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                        String str = CameraCapturer.this.pendingCameraName;
                        CameraCapturer.this.pendingCameraName = null;
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        CameraCapturer cameraCapturer2 = CameraCapturer.this;
                        cameraCapturer2.switchCameraInternal(cameraCapturer2.switchEventsHandler, str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override
        public void onFailure(CameraSession.FailureType failureType, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer.access$1710(CameraCapturer.this);
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
                        if (failureType == CameraSession.FailureType.DISCONNECTED) {
                            CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        } else {
                            CameraCapturer.this.eventsHandler.onCameraError(str);
                        }
                    } else {
                        Logging.w("CameraCapturer", "Opening camera failed, retry: " + str);
                        CameraCapturer.this.createSessionInternal(500);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    private final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() {
        @Override
        public void onCameraClosed(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession && CameraCapturer.this.currentSession != null) {
                        Logging.d("CameraCapturer", "onCameraClosed from another session.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraClosed();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override
        public void onCameraDisconnected(CameraSession cameraSession) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w("CameraCapturer", "onCameraDisconnected from another session.");
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override
        public void onCameraError(CameraSession cameraSession, String str) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.w("CameraCapturer", "onCameraError from another session: " + str);
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraError(str);
                    CameraCapturer.this.stopCapture();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override
        public void onCameraOpening() {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.currentSession != null) {
                        Logging.w("CameraCapturer", "onCameraOpening while session was open.");
                    } else {
                        CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
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
                } catch (Throwable th2) {
                    throw th2;
                }
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
            public void onCameraError(String str2) {
            }

            @Override
            public void onCameraFreezed(String str2) {
            }

            @Override
            public void onCameraOpening(String str2) {
            }

            @Override
            public void onFirstFrameAvailable() {
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
            throw new IllegalArgumentException(a4.a.s(new StringBuilder("Camera name "), this.cameraName, " does not match any known camera device."));
        }
        throw new RuntimeException("No cameras attached.");
    }

    public static int access$1710(CameraCapturer cameraCapturer) {
        int i10 = cameraCapturer.openAttemptsRemaining;
        cameraCapturer.openAttemptsRemaining = i10 - 1;
        return i10;
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() == this.cameraThreadHandler.getLooper().getThread()) {
            return;
        }
        Logging.e("CameraCapturer", "Check is on camera thread failed.");
        throw new RuntimeException("Not on camera thread.");
    }

    public void createSessionInternal(int i10) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, i10 + 10000);
        this.cameraThreadHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                CameraCapturer cameraCapturer = CameraCapturer.this;
                cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
            }
        }, i10);
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
            reportCameraSwitchError(r6.i("Attempted to switch to unknown camera device ", str), cameraSwitchHandler);
            return;
        }
        synchronized (this.stateLock) {
            try {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z10 = this.sessionOpening;
                if (!z10 && this.currentSession == null) {
                    reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
                    return;
                }
                this.switchEventsHandler = cameraSwitchHandler;
                if (z10) {
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        d.a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override
    public void changeCaptureFormat(int i10, int i11, int i12) {
        StringBuilder n10 = hc.b.n("changeCaptureFormat: ", i10, "x", i11, "@");
        n10.append(i12);
        Logging.d("CameraCapturer", n10.toString());
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i10, i11, i12);
        }
    }

    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12);

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
        d.b(this, mediaRecorderHandler);
    }

    @Override
    public void startCapture(int i10, int i11, int i12) {
        StringBuilder n10 = hc.b.n("startCapture: ", i10, "x", i11, "@");
        n10.append(i12);
        Logging.d("CameraCapturer", n10.toString());
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                try {
                    if (!this.sessionOpening && this.currentSession == null) {
                        this.width = i10;
                        this.height = i11;
                        this.framerate = i12;
                        this.sessionOpening = true;
                        this.openAttemptsRemaining = 3;
                        createSessionInternal(0);
                        return;
                    }
                    Logging.w("CameraCapturer", "Session already open");
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
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
                if (asList.size() < 2) {
                    CameraCapturer.this.reportCameraSwitchError("No camera to switch to.", cameraSwitchHandler);
                    return;
                }
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler, (String) asList.get((asList.indexOf(CameraCapturer.this.cameraName) + 1) % asList.size()));
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
