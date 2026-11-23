package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f55046a;
    public final Object f55047b;

    public h(Object obj, int i7) {
        this.f55046a = i7;
        this.f55047b = obj;
    }

    @Override
    public final void run() {
        switch (this.f55046a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f55047b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f55047b).release();
                return;
            case 2:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) this.f55047b);
                return;
            case 3:
                ((TextureViewRenderer.TextureEglRenderer) this.f55047b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f55047b);
                return;
        }
    }
}
