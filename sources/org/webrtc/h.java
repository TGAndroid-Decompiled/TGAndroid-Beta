package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f53061a;
    public final Object f53062b;

    public h(Object obj, int i7) {
        this.f53061a = i7;
        this.f53062b = obj;
    }

    @Override
    public final void run() {
        switch (this.f53061a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f53062b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f53062b).release();
                return;
            case 2:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) this.f53062b);
                return;
            case 3:
                ((TextureViewRenderer.TextureEglRenderer) this.f53062b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f53062b);
                return;
        }
    }
}
