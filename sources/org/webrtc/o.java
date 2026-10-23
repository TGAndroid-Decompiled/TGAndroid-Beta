package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43899a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43899a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f43899a.onDisplayRefreshCycleBegin(j10);
    }
}
