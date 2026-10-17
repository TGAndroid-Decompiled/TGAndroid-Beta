package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43913a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43913a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        RenderSynchronizer.a(this.f43913a, j10);
    }
}
