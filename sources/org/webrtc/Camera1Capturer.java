package org.webrtc;

import android.content.Context;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;

    public Camera1Capturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z4) {
        super(str, cameraEventsHandler, new Camera1Enumerator(z4));
        this.captureToTexture = z4;
    }

    @Override
    public void changeCaptureFormat(int i10, int i11, int i12) {
        super.changeCaptureFormat(i10, i11, i12);
    }

    @Override
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, context, surfaceTextureHelper, str, i10, i11, i12);
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
    public void startCapture(int i10, int i11, int i12) {
        super.startCapture(i10, i11, i12);
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
