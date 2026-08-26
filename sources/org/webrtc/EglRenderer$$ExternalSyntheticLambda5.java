package org.webrtc;

public final class EglRenderer$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public EglRenderer$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EglRenderer) this.f$0).renderFrameOnRenderThread();
                break;
            case 1:
                ((VideoFrame.I420Buffer) this.f$0).release();
                break;
            case 2:
                ((TextureViewRenderer.TextureEglRenderer) this.f$0).lambda$onFirstFrameRendered$0();
                break;
            default:
                ((VideoFileRenderer) this.f$0).lambda$release$3();
                break;
        }
    }
}
