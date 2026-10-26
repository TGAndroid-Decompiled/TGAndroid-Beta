package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f46448a;
    public final Object f46449b;

    public h(Object obj, int i10) {
        this.f46448a = i10;
        this.f46449b = obj;
    }

    @Override
    public final void run() {
        switch (this.f46448a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f46449b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f46449b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f46449b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f46449b);
                return;
        }
    }
}
