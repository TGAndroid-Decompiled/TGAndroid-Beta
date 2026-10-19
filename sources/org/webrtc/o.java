package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43885a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43885a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f43885a.onDisplayRefreshCycleBegin(j10);
    }
}
