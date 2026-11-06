package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f52941a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f52941a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j3) {
        RenderSynchronizer.a(this.f52941a, j3);
    }
}
