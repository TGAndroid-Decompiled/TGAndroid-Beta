package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class wb1 implements RendererCommon.RendererEvents {
    public final ec1 f51050a;

    public wb1(ec1 ec1Var) {
        this.f51050a = ec1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new ru0(this, 25));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l10(13));
    }
}
