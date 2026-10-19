package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f43874a;
    public final Object f43875b;

    public h(Object obj, int i10) {
        this.f43874a = i10;
        this.f43875b = obj;
    }

    @Override
    public final void run() {
        switch (this.f43874a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f43875b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f43875b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f43875b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f43875b);
                return;
        }
    }
}
