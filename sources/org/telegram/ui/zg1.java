package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.webrtc.RendererCommon;
public final class zg1 implements RendererCommon.RendererEvents {
    public final jh1 f43773a;

    public zg1(jh1 jh1Var) {
        this.f43773a = jh1Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        jh1 jh1Var = this.f43773a;
        com.google.android.gms.internal.cast.p pVar = jh1Var.l1;
        if (pVar != null) {
            pVar.run();
            jh1Var.l1 = null;
        }
        AndroidUtilities.runOnUIThread(new sy0(this, 23));
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
