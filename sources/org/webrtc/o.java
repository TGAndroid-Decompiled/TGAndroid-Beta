package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f40640a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f40640a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        RenderSynchronizer.a(this.f40640a, j3);
    }
}
