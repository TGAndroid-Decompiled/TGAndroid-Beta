package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class xb1 implements RendererCommon.RendererEvents {
    public final fc1 f51823a;

    public xb1(fc1 fc1Var) {
        this.f51823a = fc1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new ru0(this, 25));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(15));
    }
}
