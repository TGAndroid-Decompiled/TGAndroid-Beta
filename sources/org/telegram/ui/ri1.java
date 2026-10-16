package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class ri1 implements RendererCommon.RendererEvents {
    public final cj1 f39529a;

    public ri1(cj1 cj1Var) {
        this.f39529a = cj1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new tz0(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
