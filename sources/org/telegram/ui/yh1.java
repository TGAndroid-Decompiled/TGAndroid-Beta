package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class yh1 implements RendererCommon.RendererEvents {
    public final ii1 f43630a;

    public yh1(ii1 ii1Var) {
        this.f43630a = ii1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ii1 ii1Var = this.f43630a;
        c2.p pVar = ii1Var.f37692i1;
        if (pVar != null) {
            pVar.run();
            ii1Var.f37692i1 = null;
        }
        AndroidUtilities.runOnUIThread(new sz0(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
