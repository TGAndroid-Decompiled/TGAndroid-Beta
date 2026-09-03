package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class xh1 implements RendererCommon.RendererEvents {
    public final ii1 f39991a;

    public xh1(ii1 ii1Var) {
        this.f39991a = ii1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new sz0(this, 21));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
