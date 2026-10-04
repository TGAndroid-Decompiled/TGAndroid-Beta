package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43942a;
    public final Object f43943b;

    public h(Object obj, int i10) {
        this.f43942a = i10;
        this.f43943b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43942a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43943b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43943b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43943b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43943b);
                return;
        }
    }
}
