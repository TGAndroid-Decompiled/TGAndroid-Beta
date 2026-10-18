package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43933a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43933a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f43933a.onDisplayRefreshCycleBegin(j10);
    }
}
