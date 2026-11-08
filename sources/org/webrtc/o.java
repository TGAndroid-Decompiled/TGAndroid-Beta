package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f53058a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f53058a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f53058a.onDisplayRefreshCycleBegin(j3);
    }
}
