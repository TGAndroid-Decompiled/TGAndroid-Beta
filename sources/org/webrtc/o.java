package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40665a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40665a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        this.f40665a.onDisplayRefreshCycleBegin(j3);
    }
}
