package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43601a;
    public final Object f43602b;

    public h(Object obj, int i10) {
        this.f43601a = i10;
        this.f43602b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43601a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43602b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43602b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43602b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43602b);
                return;
        }
    }
}
