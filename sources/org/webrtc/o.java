package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f55088a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f55088a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f55088a.onDisplayRefreshCycleBegin(j3);
    }
}
