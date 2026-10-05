package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43956a;
    public final Object f43957b;

    public h(Object obj, int i10) {
        this.f43956a = i10;
        this.f43957b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43956a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43957b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43957b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f43957b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43957b);
                return;
        }
    }
}
