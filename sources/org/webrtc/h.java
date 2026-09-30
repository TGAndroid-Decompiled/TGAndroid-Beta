package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40629a;
    public final Object f40630b;

    public h(Object obj, int i10) {
        this.f40629a = i10;
        this.f40630b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40629a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40630b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40630b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f40630b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40630b);
                return;
        }
    }
}
