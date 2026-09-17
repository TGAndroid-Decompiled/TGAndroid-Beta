package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43639a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43639a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f43639a.onDisplayRefreshCycleBegin(j3);
    }
}
