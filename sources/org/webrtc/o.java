package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f45021a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f45021a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f45021a.onDisplayRefreshCycleBegin(j3);
    }
}
