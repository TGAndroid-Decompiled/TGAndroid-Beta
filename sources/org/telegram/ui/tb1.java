package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class tb1 implements RendererCommon.RendererEvents {
    public final zb1 f49768a;

    public tb1(zb1 zb1Var) {
        this.f49768a = zb1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        zb1 zb1Var = this.f49768a;
        b8.cg cgVar = zb1Var.m1;
        if (cgVar != null) {
            cgVar.run();
            zb1Var.m1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
