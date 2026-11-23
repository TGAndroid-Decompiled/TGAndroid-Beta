package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f55081a;
    public final Object f55082b;

    public h(Object obj, int i7) {
        this.f55081a = i7;
        this.f55082b = obj;
    }

    @Override
    public final void run() {
        switch (this.f55081a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f55082b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f55082b).release();
                return;
            case 2:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) this.f55082b);
                return;
            case 3:
                ((TextureViewRenderer.TextureEglRenderer) this.f55082b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f55082b);
                return;
        }
    }
}
