package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ti1 implements RendererCommon.RendererEvents {
    public final dj1 f40393a;

    public ti1(dj1 dj1Var) {
        this.f40393a = dj1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        dj1 dj1Var = this.f40393a;
        com.google.android.gms.internal.cast.p pVar = dj1Var.l1;
        if (pVar != null) {
            pVar.run();
            dj1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new uz0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
