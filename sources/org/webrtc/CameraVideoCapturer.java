package org.webrtc;

import android.media.MediaRecorder;
public interface CameraVideoCapturer extends VideoCapturer {

    public interface CameraEventsHandler {
        void onCameraClosed();

        void onCameraDisconnected();

        void onCameraError(String str);

        void onCameraFreezed(String str);

        void onCameraOpening(String str);

        void onFirstFrameAvailable();
    }

    public static class CameraStatistics {
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final String TAG = "CameraStatistics";
        private final Runnable cameraObserver;
        private final CameraEventsHandler eventsHandler;
        private int frameCount;
        private int freezePeriodCount;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public CameraStatistics(SurfaceTextureHelper surfaceTextureHelper, CameraEventsHandler cameraEventsHandler) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    int round = Math.round((CameraStatistics.this.frameCount * 1000.0f) / 2000.0f);
                    Logging.d("CameraStatistics", "Camera fps: " + round + ".");
                    int i = CameraStatistics.this.frameCount;
                    CameraStatistics cameraStatistics = CameraStatistics.this;
                    if (i != 0) {
                        cameraStatistics.freezePeriodCount = 0;
                    } else {
                        CameraStatistics.access$104(cameraStatistics);
                        if (CameraStatistics.this.freezePeriodCount * 2000 >= 4000 && CameraStatistics.this.eventsHandler != null) {
                            Logging.e("CameraStatistics", "Camera freezed.");
                            boolean isTextureInUse = CameraStatistics.this.surfaceTextureHelper.isTextureInUse();
                            CameraStatistics cameraStatistics2 = CameraStatistics.this;
                            if (isTextureInUse) {
                                cameraStatistics2.eventsHandler.onCameraFreezed("Camera failure. Client must return video buffers.");
                                return;
                            } else {
                                cameraStatistics2.eventsHandler.onCameraFreezed("Camera failure.");
                                return;
                            }
                        }
                    }
                    CameraStatistics.this.frameCount = 0;
                    CameraStatistics.this.surfaceTextureHelper.getHandler().postDelayed(this, 2000L);
                }
            };
            this.cameraObserver = runnable;
            if (surfaceTextureHelper != null) {
                this.surfaceTextureHelper = surfaceTextureHelper;
                this.eventsHandler = cameraEventsHandler;
                this.frameCount = 0;
                this.freezePeriodCount = 0;
                surfaceTextureHelper.getHandler().postDelayed(runnable, 2000L);
                return;
            }
            w26.j("SurfaceTextureHelper is null");
            throw null;
        }

        public static int access$104(CameraStatistics cameraStatistics) {
            int i = cameraStatistics.freezePeriodCount + 1;
            cameraStatistics.freezePeriodCount = i;
            return i;
        }

        private void checkThread() {
            if (Thread.currentThread() == this.surfaceTextureHelper.getHandler().getLooper().getThread()) {
                return;
            }
            sc8.j("Wrong thread");
        }

        public void addFrame() {
            checkThread();
            this.frameCount++;
        }

        public void release() {
            this.surfaceTextureHelper.getHandler().removeCallbacks(this.cameraObserver);
        }
    }

    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean z);

        void onCameraSwitchError(String str);
    }

    @Deprecated
    public interface MediaRecorderHandler {
        void onMediaRecorderError(String str);

        void onMediaRecorderSuccess();
    }

    @Deprecated
    void addMediaRecorderToCamera(MediaRecorder mediaRecorder, MediaRecorderHandler mediaRecorderHandler);

    @Deprecated
    void removeMediaRecorderFromCamera(MediaRecorderHandler mediaRecorderHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler);

    void switchCamera(CameraSwitchHandler cameraSwitchHandler, String str);
}
