package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f46456a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f46456a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f46456a.onDisplayRefreshCycleBegin(j10);
    }
}
