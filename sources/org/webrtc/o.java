package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f55057a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f55057a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f55057a.onDisplayRefreshCycleBegin(j3);
    }
}
