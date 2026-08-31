package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class sh1 implements RendererCommon.RendererEvents {
    public final ci1 f41292a;

    public sh1(ci1 ci1Var) {
        this.f41292a = ci1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ci1 ci1Var = this.f41292a;
        c2.p pVar = ci1Var.f35840i1;
        if (pVar != null) {
            pVar.run();
            ci1Var.f35840i1 = null;
        }
        AndroidUtilities.runOnUIThread(new xy0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
