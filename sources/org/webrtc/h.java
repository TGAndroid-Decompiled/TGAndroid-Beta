package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43876a;
    public final Object f43877b;

    public h(Object obj, int i10) {
        this.f43876a = i10;
        this.f43877b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43876a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43877b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43877b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43877b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43877b);
                return;
        }
    }
}
