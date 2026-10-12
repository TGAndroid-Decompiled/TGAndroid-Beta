package org.webrtc;

import android.view.Choreographer;
public final class p implements Choreographer.FrameCallback {
    public final RenderSynchronizer f42806a;

    public p(RenderSynchronizer renderSynchronizer) {
        this.f42806a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        this.f42806a.onDisplayRefreshCycleBegin(j10);
    }
}
