package org.webrtc;

public final class h implements Runnable {

    public final int f45304a;

    public final Object f45305b;

    public h(Object obj, int i10) {
        this.f45304a = i10;
        this.f45305b = obj;
    }

    @Override
    public final void run() {
        switch (this.f45304a) {
            case 0:
                ((EglRenderer) this.f45305b).renderFrameOnRenderThread();
                break;
            case 1:
                ((VideoFrame.I420Buffer) this.f45305b).release();
                break;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f45305b).lambda$onFirstFrameRendered$0();
                break;
            default:
                ((VideoFileRenderer) this.f45305b).lambda$release$3();
                break;
        }
    }
}
