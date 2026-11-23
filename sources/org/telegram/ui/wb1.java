package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class wb1 implements RendererCommon.RendererEvents {
    public final fc1 f53289a;

    public wb1(fc1 fc1Var) {
        this.f53289a = fc1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        org.telegram.messenger.g0.g3(new qu0(this, 24));
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
