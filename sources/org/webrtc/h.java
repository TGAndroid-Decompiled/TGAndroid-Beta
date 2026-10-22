package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43887a;
    public final Object f43888b;

    public h(Object obj, int i10) {
        this.f43887a = i10;
        this.f43888b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43887a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43888b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43888b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43888b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43888b);
                return;
        }
    }
}
