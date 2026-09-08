package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43638a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43638a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f43638a.onDisplayRefreshCycleBegin(j3);
    }
}
