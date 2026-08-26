package org.webrtc;

public final class RenderSynchronizer$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final RenderSynchronizer f$0;

    public RenderSynchronizer$$ExternalSyntheticLambda1(RenderSynchronizer renderSynchronizer, int i) {
        this.$r8$classId = i;
        this.f$0 = renderSynchronizer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$registerListener$1();
                break;
            default:
                this.f$0.lambda$new$0();
                break;
        }
    }
}
