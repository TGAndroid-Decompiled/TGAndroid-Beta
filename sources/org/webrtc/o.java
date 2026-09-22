package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40686a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40686a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40686a.onDisplayRefreshCycleBegin(j3);
    }
}
