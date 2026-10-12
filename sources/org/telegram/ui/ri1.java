package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ri1 implements RendererCommon.RendererEvents {
    public final xi1 f41665a;

    public ri1(xi1 xi1Var) {
        this.f41665a = xi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        xi1 xi1Var = this.f41665a;
        com.google.android.gms.internal.cast.p pVar = xi1Var.l1;
        if (pVar != null) {
            pVar.run();
            xi1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
