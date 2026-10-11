package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f45201a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f45201a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f45201a.onDisplayRefreshCycleBegin(j3);
    }
}
