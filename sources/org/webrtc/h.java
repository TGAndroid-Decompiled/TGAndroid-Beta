package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43949a;
    public final Object f43950b;

    public h(Object obj, int i10) {
        this.f43949a = i10;
        this.f43950b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43949a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43950b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43950b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f43950b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43950b);
                return;
        }
    }
}
