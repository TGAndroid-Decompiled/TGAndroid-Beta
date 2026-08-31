package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class wh1 implements RendererCommon.RendererEvents {
    public final ci1 f42822a;

    public wh1(ci1 ci1Var) {
        this.f42822a = ci1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ci1 ci1Var = this.f42822a;
        c2.p pVar = ci1Var.f35840i1;
        if (pVar != null) {
            pVar.run();
            ci1Var.f35840i1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
