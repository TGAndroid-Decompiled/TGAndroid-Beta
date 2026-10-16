package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class wi1 implements RendererCommon.RendererEvents {
    public final cj1 f41297a;

    public wi1(cj1 cj1Var) {
        this.f41297a = cj1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        cj1 cj1Var = this.f41297a;
        com.google.android.gms.internal.cast.p pVar = cj1Var.l1;
        if (pVar != null) {
            pVar.run();
            cj1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
