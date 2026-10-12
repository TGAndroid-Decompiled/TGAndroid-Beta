package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45002a;
    public final Object f45003b;

    public h(Object obj, int i10) {
        this.f45002a = i10;
        this.f45003b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45002a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45003b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45003b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45003b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45003b);
                return;
        }
    }
}
