package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class vd1 implements RendererCommon.RendererEvents {
    public final be1 f42711a;

    public vd1(be1 be1Var) {
        this.f42711a = be1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        be1 be1Var = this.f42711a;
        com.google.android.gms.internal.cast.o oVar = be1Var.l1;
        if (oVar != null) {
            oVar.run();
            be1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
