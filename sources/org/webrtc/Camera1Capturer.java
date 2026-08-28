package org.webrtc;

import android.content.Context;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;

    public Camera1Capturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z10) {
        super(str, cameraEventsHandler, new Camera1Enumerator(z10));
        this.captureToTexture = z10;
    }

    @Override
    public void changeCaptureFormat(int i9, int i10, int i11) {
        super.changeCaptureFormat(i9, i10, i11);
    }

    @Override
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i9, int i10, int i11) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, context, surfaceTextureHelper, str, i9, i10, i11);
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
    public void startCapture(int i9, int i10, int i11) {
        super.startCapture(i9, i10, i11);
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
