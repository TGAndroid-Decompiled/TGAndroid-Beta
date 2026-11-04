package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f53032a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f53032a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f53032a.onDisplayRefreshCycleBegin(j10);
    }
}
