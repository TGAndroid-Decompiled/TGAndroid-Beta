package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40353a;
    public final Object f40354b;

    public h(Object obj, int i10) {
        this.f40353a = i10;
        this.f40354b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40353a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40354b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40354b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40354b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40354b);
                return;
        }
    }
}
