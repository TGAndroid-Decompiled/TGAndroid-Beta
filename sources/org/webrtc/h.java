package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45298a;
    public final Object f45299b;

    public h(Object obj, int i9) {
        this.f45298a = i9;
        this.f45299b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45298a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45299b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45299b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45299b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45299b);
                return;
        }
    }
}
