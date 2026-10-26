package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f46459a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f46459a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f46459a.onDisplayRefreshCycleBegin(j10);
    }
}
