package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f45133a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f45133a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f45133a.onDisplayRefreshCycleBegin(j3);
    }
}
