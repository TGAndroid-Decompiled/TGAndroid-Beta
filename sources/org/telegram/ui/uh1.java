package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class uh1 implements RendererCommon.RendererEvents {
    public final ai1 f38947a;

    public uh1(ai1 ai1Var) {
        this.f38947a = ai1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ai1 ai1Var = this.f38947a;
        c2.p pVar = ai1Var.f32619i1;
        if (pVar != null) {
            pVar.run();
            ai1Var.f32619i1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
