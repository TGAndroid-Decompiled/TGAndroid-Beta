package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f52930a;
    public final Object f52931b;

    public h(Object obj, int i7) {
        this.f52930a = i7;
        this.f52931b = obj;
    }

    @Override
    public final void run() {
        switch (this.f52930a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f52931b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f52931b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f52931b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f52931b);
                return;
        }
    }
}
