package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f55092a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f55092a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f55092a.onDisplayRefreshCycleBegin(j3);
    }
}
