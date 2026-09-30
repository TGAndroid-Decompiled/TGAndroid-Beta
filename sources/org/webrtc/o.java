package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40737a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40737a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40737a.onDisplayRefreshCycleBegin(j3);
    }
}
