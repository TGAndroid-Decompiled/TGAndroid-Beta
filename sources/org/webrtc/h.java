package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f54467a;
    public final Object f54468b;

    public h(Object obj, int i7) {
        this.f54467a = i7;
        this.f54468b = obj;
    }

    @Override
    public final void run() {
        switch (this.f54467a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f54468b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f54468b).release();
                return;
            case 2:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) this.f54468b);
                return;
            case 3:
                ((TextureViewRenderer.TextureEglRenderer) this.f54468b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f54468b);
                return;
        }
    }
}
