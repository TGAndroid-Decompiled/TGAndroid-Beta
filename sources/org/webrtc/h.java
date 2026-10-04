package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43941a;
    public final Object f43942b;

    public h(Object obj, int i10) {
        this.f43941a = i10;
        this.f43942b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43941a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43942b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43942b).release();
                return;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f43942b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43942b);
                return;
        }
    }
}
