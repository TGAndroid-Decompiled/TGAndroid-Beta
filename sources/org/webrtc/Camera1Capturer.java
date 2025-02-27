package org.webrtc;

import android.content.Context;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;

public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;

    public Camera1Capturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z) {
        super(str, cameraEventsHandler, new Camera1Enumerator(z));
        this.captureToTexture = z;
    }

    @Override
    public void changeCaptureFormat(int i, int i2, int i3) {
        super.changeCaptureFormat(i, i2, i3);
    }

    @Override
    protected void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i, int i2, int i3) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, context, surfaceTextureHelper, Camera1Enumerator.getCameraIndex(str), i, i2, i3);
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override
    public boolean isScreencast() {
        return super.isScreencast();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void startCapture(int i, int i2, int i3) {
        super.startCapture(i, i2, i3);
    }

    @Override
    public void stopCapture() {
        super.stopCapture();
    }

    @Override
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override
    public void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        super.switchCamera(cameraSwitchHandler, str);
    }
}
