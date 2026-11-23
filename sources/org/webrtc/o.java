package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f55173a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f55173a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f55173a.onDisplayRefreshCycleBegin(j3);
    }
}
