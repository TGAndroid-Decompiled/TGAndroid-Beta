package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40364a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40364a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40364a.onDisplayRefreshCycleBegin(j3);
    }
}
