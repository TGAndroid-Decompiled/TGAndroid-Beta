package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f44080a;
    public final Object f44081b;

    public h(Object obj, int i10) {
        this.f44080a = i10;
        this.f44081b = obj;
    }

    @Override
    public final void run() {
        switch (this.f44080a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f44081b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f44081b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f44081b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f44081b);
                return;
        }
    }
}
