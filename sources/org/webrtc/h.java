package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45378a;
    public final Object f45379b;

    public h(Object obj, int i10) {
        this.f45378a = i10;
        this.f45379b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45378a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45379b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45379b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f45379b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45379b);
                return;
        }
    }
}
