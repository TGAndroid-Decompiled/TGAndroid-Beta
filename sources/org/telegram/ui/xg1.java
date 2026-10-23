package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class xg1 implements RendererCommon.RendererEvents {
    public final hh1 f43222a;

    public xg1(hh1 hh1Var) {
        this.f43222a = hh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        hh1 hh1Var = this.f43222a;
        com.google.android.gms.internal.cast.p pVar = hh1Var.l1;
        if (pVar != null) {
            pVar.run();
            hh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new qy0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
