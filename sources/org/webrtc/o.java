package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40395a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40395a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40395a.onDisplayRefreshCycleBegin(j3);
    }
}
