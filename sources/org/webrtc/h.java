package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f53021a;
    public final Object f53022b;

    public h(Object obj, int i3) {
        this.f53021a = i3;
        this.f53022b = obj;
    }

    @Override
    public final void run() {
        switch (this.f53021a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f53022b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f53022b).release();
                return;
            case 2:
                TextureViewRenderer.TextureEglRenderer.j((TextureViewRenderer.TextureEglRenderer) this.f53022b);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f53022b);
                return;
        }
    }
}
