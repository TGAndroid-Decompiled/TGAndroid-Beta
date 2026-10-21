package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43895a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43895a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f43895a.onDisplayRefreshCycleBegin(j10);
    }
}
