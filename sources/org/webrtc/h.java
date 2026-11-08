package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f53048a;
    public final Object f53049b;

    public h(Object obj, int i7) {
        this.f53048a = i7;
        this.f53049b = obj;
    }

    @Override
    public final void run() {
        switch (this.f53048a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f53049b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f53049b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f53049b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f53049b);
                return;
        }
    }
}
