package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class si1 implements RendererCommon.RendererEvents {
    public final dj1 f40155a;

    public si1(dj1 dj1Var) {
        this.f40155a = dj1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new uz0(this, 22));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
