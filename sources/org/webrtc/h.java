package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40628a;
    public final Object f40629b;

    public h(Object obj, int i10) {
        this.f40628a = i10;
        this.f40629b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40628a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40629b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40629b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40629b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40629b);
                return;
        }
    }
}
