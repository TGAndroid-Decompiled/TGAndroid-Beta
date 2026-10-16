package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class si1 implements RendererCommon.RendererEvents {
    public final cj1 f39831a;

    public si1(cj1 cj1Var) {
        this.f39831a = cj1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        cj1 cj1Var = this.f39831a;
        com.google.android.gms.internal.cast.p pVar = cj1Var.l1;
        if (pVar != null) {
            pVar.run();
            cj1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new tz0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
