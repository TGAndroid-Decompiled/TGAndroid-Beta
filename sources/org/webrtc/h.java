package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f46483a;
    public final Object f46484b;

    public h(Object obj, int i10) {
        this.f46483a = i10;
        this.f46484b = obj;
    }

    @Override
    public final void run() {
        switch (this.f46483a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f46484b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f46484b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f46484b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f46484b);
                return;
        }
    }
}
