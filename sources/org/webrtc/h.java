package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43628a;
    public final Object f43629b;

    public h(Object obj, int i10) {
        this.f43628a = i10;
        this.f43629b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43628a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43629b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43629b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43629b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43629b);
                return;
        }
    }
}
