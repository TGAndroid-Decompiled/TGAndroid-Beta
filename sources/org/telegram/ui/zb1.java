package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class zb1 implements RendererCommon.RendererEvents {
    public final ic1 f52495a;

    public zb1(ic1 ic1Var) {
        this.f52495a = ic1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new tu0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
