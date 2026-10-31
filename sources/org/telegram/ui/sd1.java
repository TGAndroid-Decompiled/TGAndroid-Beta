package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class sd1 implements RendererCommon.RendererEvents {
    public final be1 f41481a;

    public sd1(be1 be1Var) {
        this.f41481a = be1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        be1 be1Var = this.f41481a;
        com.google.android.gms.internal.cast.o oVar = be1Var.l1;
        if (oVar != null) {
            oVar.run();
            be1Var.l1 = null;
        }
        org.telegram.messenger.i0.g3(new wv0(this, 27));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
