package org.telegram.ui;

import org.webrtc.RendererCommon;
public final class ti1 implements RendererCommon.RendererEvents {
    public final zi1 f36951a;

    public ti1(zi1 zi1Var) {
        this.f36951a = zi1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        zi1 zi1Var = this.f36951a;
        com.google.android.gms.internal.cast.p pVar = zi1Var.l1;
        if (pVar != null) {
            pVar.run();
            zi1Var.l1 = null;
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
