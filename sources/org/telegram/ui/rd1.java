package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class rd1 implements RendererCommon.RendererEvents {
    public final be1 f41206a;

    public rd1(be1 be1Var) {
        this.f41206a = be1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.i0.g3(new wv0(this, 26));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
