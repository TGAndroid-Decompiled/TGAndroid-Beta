package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40390a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40390a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40390a.onDisplayRefreshCycleBegin(j3);
    }
}
