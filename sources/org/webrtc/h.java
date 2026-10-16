package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f42495a;
    public final Object f42496b;

    public h(Object obj, int i10) {
        this.f42495a = i10;
        this.f42496b = obj;
    }

    @Override
    public final void run() {
        switch (this.f42495a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f42496b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f42496b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f42496b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f42496b);
                return;
        }
    }
}
