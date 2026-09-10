package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f39485a;
    public final Object f39486b;

    public h(Object obj, int i10) {
        this.f39485a = i10;
        this.f39486b = obj;
    }

    @Override
    public final void run() {
        switch (this.f39485a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f39486b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f39486b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f39486b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f39486b);
                return;
        }
    }
}
