package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43893a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43893a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f43893a.onDisplayRefreshCycleBegin(j10);
    }
}
