package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43967a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43967a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f43967a.onDisplayRefreshCycleBegin(j3);
    }
}
