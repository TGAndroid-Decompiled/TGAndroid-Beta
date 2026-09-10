package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f39496a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f39496a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f39496a.onDisplayRefreshCycleBegin(j3);
    }
}
