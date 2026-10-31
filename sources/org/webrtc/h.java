package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f44495a;
    public final Object f44496b;

    public h(Object obj, int i10) {
        this.f44495a = i10;
        this.f44496b = obj;
    }

    @Override
    public final void run() {
        switch (this.f44495a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f44496b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f44496b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f44496b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f44496b);
                return;
        }
    }
}
