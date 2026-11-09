package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f53062a;
    public final Object f53063b;

    public h(Object obj, int i7) {
        this.f53062a = i7;
        this.f53063b = obj;
    }

    @Override
    public final void run() {
        switch (this.f53062a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f53063b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f53063b).release();
                return;
            case 2:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) this.f53063b);
                return;
            case 3:
                ((TextureViewRenderer.TextureEglRenderer) this.f53063b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f53063b);
                return;
        }
    }
}
