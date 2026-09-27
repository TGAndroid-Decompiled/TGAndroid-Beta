package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class zh1 implements RendererCommon.RendererEvents {
    public final ki1 f40530a;

    public zh1(ki1 ki1Var) {
        this.f40530a = ki1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        AndroidUtilities.runOnUIThread(new xz0(this, 21));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
