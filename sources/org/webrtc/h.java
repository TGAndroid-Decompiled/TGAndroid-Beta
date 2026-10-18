package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43882a;
    public final Object f43883b;

    public h(Object obj, int i10) {
        this.f43882a = i10;
        this.f43883b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43882a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43883b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43883b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43883b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43883b);
                return;
        }
    }
}
