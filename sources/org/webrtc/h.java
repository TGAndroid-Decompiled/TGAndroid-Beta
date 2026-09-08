package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43627a;
    public final Object f43628b;

    public h(Object obj, int i10) {
        this.f43627a = i10;
        this.f43628b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43627a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43628b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43628b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43628b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43628b);
                return;
        }
    }
}
