package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class yb1 implements RendererCommon.RendererEvents {
    public final hc1 f54160a;

    public yb1(hc1 hc1Var) {
        this.f54160a = hc1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new ru0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
