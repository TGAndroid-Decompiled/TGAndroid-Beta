package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f43887a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f43887a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        RenderSynchronizer.a(this.f43887a, j10);
    }
}
