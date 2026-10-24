package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f44313a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f44313a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f44313a.onDisplayRefreshCycleBegin(j10);
    }
}
