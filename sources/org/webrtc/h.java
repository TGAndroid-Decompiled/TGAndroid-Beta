package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40357a;
    public final Object f40358b;

    public h(Object obj, int i10) {
        this.f40357a = i10;
        this.f40358b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40357a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40358b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40358b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40358b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40358b);
                return;
        }
    }
}
