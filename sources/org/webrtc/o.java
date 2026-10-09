package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f45131a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f45131a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f45131a.onDisplayRefreshCycleBegin(j3);
    }
}
