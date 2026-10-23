package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43888a;
    public final Object f43889b;

    public h(Object obj, int i10) {
        this.f43888a = i10;
        this.f43889b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43888a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43889b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43889b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43889b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43889b);
                return;
        }
    }
}
