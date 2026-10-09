package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45120a;
    public final Object f45121b;

    public h(Object obj, int i10) {
        this.f45120a = i10;
        this.f45121b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45120a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45121b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45121b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45121b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45121b);
                return;
        }
    }
}
