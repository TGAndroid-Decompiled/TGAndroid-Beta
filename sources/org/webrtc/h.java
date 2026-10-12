package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f42792a;
    public final Object f42793b;

    public h(Object obj, int i10) {
        this.f42792a = i10;
        this.f42793b = obj;
    }

    @Override
    public final void run() {
        switch (this.f42792a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f42793b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f42793b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f42793b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f42793b);
                return;
        }
    }
}
