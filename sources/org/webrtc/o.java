package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f42506a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f42506a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f42506a.onDisplayRefreshCycleBegin(j10);
    }
}
