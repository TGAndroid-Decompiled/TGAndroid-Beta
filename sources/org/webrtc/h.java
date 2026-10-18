package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43922a;
    public final Object f43923b;

    public h(Object obj, int i10) {
        this.f43922a = i10;
        this.f43923b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43922a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43923b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43923b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43923b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43923b);
                return;
        }
    }
}
