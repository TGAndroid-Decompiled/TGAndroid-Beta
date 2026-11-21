package org.webrtc;

import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoFrame;
public final class h implements Runnable {
    public final int f55077a;
    public final Object f55078b;

    public h(Object obj, int i7) {
        this.f55077a = i7;
        this.f55078b = obj;
    }

    @Override
    public final void run() {
        switch (this.f55077a) {
            case 0:
                EglRenderer.f((EglRenderer) this.f55078b);
                return;
            case 1:
                ((VideoFrame.I420Buffer) this.f55078b).release();
                return;
            case 2:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) this.f55078b);
                return;
            case 3:
                ((TextureViewRenderer.TextureEglRenderer) this.f55078b).lambda$onFirstFrameRendered$0();
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.f55078b);
                return;
        }
    }
}
