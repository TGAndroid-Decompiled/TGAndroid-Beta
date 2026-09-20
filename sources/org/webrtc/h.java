package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40654a;
    public final Object f40655b;

    public h(Object obj, int i10) {
        this.f40654a = i10;
        this.f40655b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40654a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40655b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40655b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40655b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40655b);
                return;
        }
    }
}
