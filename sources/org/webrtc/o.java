package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f45309a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f45309a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f45309a.onDisplayRefreshCycleBegin(j10);
    }
}
