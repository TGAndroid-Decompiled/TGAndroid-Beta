package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f44303a;
    public final Object f44304b;

    public h(Object obj, int i10) {
        this.f44303a = i10;
        this.f44304b = obj;
    }

    @Override
    public final void run() {
        switch (this.f44303a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f44304b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f44304b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f44304b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f44304b);
                return;
        }
    }
}
