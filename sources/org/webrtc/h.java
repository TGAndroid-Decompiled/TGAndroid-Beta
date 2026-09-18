package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f40384a;
    public final Object f40385b;

    public h(Object obj, int i10) {
        this.f40384a = i10;
        this.f40385b = obj;
    }

    @Override
    public final void run() {
        switch (this.f40384a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f40385b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f40385b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f40385b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f40385b);
                return;
        }
    }
}
