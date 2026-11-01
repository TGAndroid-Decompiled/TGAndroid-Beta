package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class td1 implements RendererCommon.RendererEvents {
    public final zd1 f41624a;

    public td1(zd1 zd1Var) {
        this.f41624a = zd1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        zd1 zd1Var = this.f41624a;
        com.google.android.gms.internal.cast.o oVar = zd1Var.l1;
        if (oVar != null) {
            oVar.run();
            zd1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
