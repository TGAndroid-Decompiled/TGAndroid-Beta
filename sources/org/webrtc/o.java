package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40637a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40637a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40637a.onDisplayRefreshCycleBegin(j3);
    }
}
