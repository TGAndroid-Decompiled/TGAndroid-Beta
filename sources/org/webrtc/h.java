package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f45122a;
    public final Object f45123b;

    public h(Object obj, int i10) {
        this.f45122a = i10;
        this.f45123b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45122a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f45123b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f45123b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f45123b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f45123b);
                return;
        }
    }
}
