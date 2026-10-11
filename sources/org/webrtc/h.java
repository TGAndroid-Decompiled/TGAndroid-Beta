package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45190a;
    public final Object f45191b;

    public h(Object obj, int i10) {
        this.f45190a = i10;
        this.f45191b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45190a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45191b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45191b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45191b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45191b);
                return;
        }
    }
}
