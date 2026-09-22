package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40675a;
    public final Object f40676b;

    public h(Object obj, int i10) {
        this.f40675a = i10;
        this.f40676b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40675a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40676b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40676b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40676b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40676b);
                return;
        }
    }
}
