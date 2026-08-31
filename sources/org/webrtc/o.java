package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f44060a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f44060a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f44060a.onDisplayRefreshCycleBegin(j10);
    }
}
