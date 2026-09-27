package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40636a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40636a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40636a.onDisplayRefreshCycleBegin(j3);
    }
}
