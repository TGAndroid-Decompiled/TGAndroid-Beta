package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f52956a;
    public final Object f52957b;

    public h(Object obj, int i7) {
        this.f52956a = i7;
        this.f52957b = obj;
    }

    @Override
    public final void run() {
        switch (this.f52956a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f52957b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f52957b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f52957b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f52957b);
                return;
        }
    }
}
