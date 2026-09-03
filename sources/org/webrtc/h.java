package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40924a;
    public final Object f40925b;

    public h(Object obj, int i10) {
        this.f40924a = i10;
        this.f40925b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40924a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40925b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40925b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40925b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40925b);
                return;
        }
    }
}
