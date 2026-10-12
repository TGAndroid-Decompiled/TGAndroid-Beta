package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45010a;
    public final Object f45011b;

    public h(Object obj, int i10) {
        this.f45010a = i10;
        this.f45011b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45010a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45011b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45011b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45011b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45011b);
                return;
        }
    }
}
