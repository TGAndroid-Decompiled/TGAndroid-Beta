package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40913a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40913a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f40913a.onDisplayRefreshCycleBegin(j10);
    }
}
