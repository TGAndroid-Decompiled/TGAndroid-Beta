package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43952a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43952a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f43952a.onDisplayRefreshCycleBegin(j3);
    }
}
