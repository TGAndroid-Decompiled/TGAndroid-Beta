package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f44314a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f44314a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f44314a.onDisplayRefreshCycleBegin(j10);
    }
}
