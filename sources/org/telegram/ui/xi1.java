package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class xi1 implements RendererCommon.RendererEvents {
    public final dj1 f41867a;

    public xi1(dj1 dj1Var) {
        this.f41867a = dj1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        dj1 dj1Var = this.f41867a;
        com.google.android.gms.internal.cast.p pVar = dj1Var.l1;
        if (pVar != null) {
            pVar.run();
            dj1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
