package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f44091a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f44091a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f44091a.onDisplayRefreshCycleBegin(j10);
    }
}
