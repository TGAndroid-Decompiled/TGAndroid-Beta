package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45156a;
    public final Object f45157b;

    public h(Object obj, int i10) {
        this.f45156a = i10;
        this.f45157b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45156a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45157b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45157b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45157b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45157b);
                return;
        }
    }
}
