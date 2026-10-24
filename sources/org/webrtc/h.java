package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f44302a;
    public final Object f44303b;

    public h(Object obj, int i10) {
        this.f44302a = i10;
        this.f44303b = obj;
    }

    @Override
    public final void run() {
        switch (this.f44302a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f44303b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f44303b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f44303b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f44303b);
                return;
        }
    }
}
