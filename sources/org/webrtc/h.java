package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43600a;
    public final Object f43601b;

    public h(Object obj, int i10) {
        this.f43600a = i10;
        this.f43601b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43600a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43601b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43601b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43601b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43601b);
                return;
        }
    }
}
