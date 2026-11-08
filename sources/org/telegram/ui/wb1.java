package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class wb1 implements RendererCommon.RendererEvents {
    public final fc1 f51054a;

    public wb1(fc1 fc1Var) {
        this.f51054a = fc1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new ru0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
