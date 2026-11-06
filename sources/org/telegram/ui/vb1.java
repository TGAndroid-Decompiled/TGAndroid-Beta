package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class vb1 implements RendererCommon.RendererEvents {
    public final ec1 f50690a;

    public vb1(ec1 ec1Var) {
        this.f50690a = ec1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.h3(new ru0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
