package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f44049a;
    public final Object f44050b;

    public h(Object obj, int i10) {
        this.f44049a = i10;
        this.f44050b = obj;
    }

    @Override
    public final void run() {
        switch (this.f44049a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f44050b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f44050b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f44050b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f44050b);
                return;
        }
    }
}
