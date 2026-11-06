package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f52965a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f52965a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f52965a.onDisplayRefreshCycleBegin(j3);
    }
}
