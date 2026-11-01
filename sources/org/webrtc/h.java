package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f44506a;
    public final Object f44507b;

    public h(Object obj, int i10) {
        this.f44506a = i10;
        this.f44507b = obj;
    }

    @Override
    public final void run() {
        switch (this.f44506a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f44507b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f44507b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f44507b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f44507b);
                return;
        }
    }
}
