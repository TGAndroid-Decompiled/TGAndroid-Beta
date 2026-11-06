package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f52954a;
    public final Object f52955b;

    public h(Object obj, int i7) {
        this.f52954a = i7;
        this.f52955b = obj;
    }

    @Override
    public final void run() {
        switch (this.f52954a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f52955b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f52955b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f52955b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f52955b);
                return;
        }
    }
}
