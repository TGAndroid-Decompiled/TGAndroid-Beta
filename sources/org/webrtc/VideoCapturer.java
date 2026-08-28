package org.webrtc;

import android.content.Context;
public interface VideoCapturer {
    void changeCaptureFormat(int i9, int i10, int i11);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i9, int i10, int i11);

    void stopCapture();
}
