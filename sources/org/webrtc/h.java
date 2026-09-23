package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40308a;
    public final Object f40309b;

    public h(Object obj, int i10) {
        this.f40308a = i10;
        this.f40309b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40308a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40309b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40309b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40309b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40309b);
                return;
        }
    }
}
