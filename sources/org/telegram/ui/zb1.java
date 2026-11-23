package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class zb1 implements RendererCommon.RendererEvents {
    public final hc1 f54522a;

    public zb1(hc1 hc1Var) {
        this.f54522a = hc1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new ru0(this, 25));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.Components.me(21));
    }
}
