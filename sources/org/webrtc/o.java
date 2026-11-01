package org.webrtc;

import android.view.Choreographer;
public final class o implements Choreographer.FrameCallback {
    public final RenderSynchronizer f44517a;

    public o(RenderSynchronizer renderSynchronizer) {
        this.f44517a = renderSynchronizer;
    }

    @Override
    public final void doFrame(long j10) {
        RenderSynchronizer.a(this.f44517a, j10);
    }
}
