package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f55036a;
    public final Object f55037b;

    public h(Object obj, int i7) {
        this.f55036a = i7;
        this.f55037b = obj;
    }

    @Override
    public final void run() {
        switch (this.f55036a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f55037b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f55037b).release();
                return;
            case 2:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) this.f55037b);
                return;
            case 3:
                ((TextureViewRenderer.TextureEglRenderer) this.f55037b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f55037b);
                return;
        }
    }
}
