package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45166a;
    public final Object f45167b;

    public h(Object obj, int i10) {
        this.f45166a = i10;
        this.f45167b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45166a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45167b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45167b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45167b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45167b);
                return;
        }
    }
}
