package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43902a;
    public final Object f43903b;

    public h(Object obj, int i10) {
        this.f43902a = i10;
        this.f43903b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43902a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43903b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43903b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43903b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43903b);
                return;
        }
    }
}
