package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40319a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40319a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40319a.onDisplayRefreshCycleBegin(j3);
    }
}
