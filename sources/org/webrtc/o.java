package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f54478a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f54478a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f54478a.onDisplayRefreshCycleBegin(j3);
    }
}
