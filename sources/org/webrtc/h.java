package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f53047a;
    public final Object f53048b;

    public h(Object obj, int i7) {
        this.f53047a = i7;
        this.f53048b = obj;
    }

    @Override
    public final void run() {
        switch (this.f53047a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f53048b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f53048b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f53048b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f53048b);
                return;
        }
    }
}
