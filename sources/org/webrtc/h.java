package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40902a;
    public final Object f40903b;

    public h(Object obj, int i10) {
        this.f40902a = i10;
        this.f40903b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40902a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40903b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40903b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40903b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40903b);
                return;
        }
    }
}
