package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wa1 extends rq {
    public final boolean[] f37786d1;
    public final fb1 f37787e1;
    public final ya1 f37788f1;

    public wa1(ya1 ya1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, fb1 fb1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f37788f1 = ya1Var;
        this.f37786d1 = zArr;
        this.f37787e1 = fb1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f37786d1[0]) {
            fb1 fb1Var = this.f37787e1;
            if (org.telegram.ui.Components.wc.a(fb1Var)) {
                org.telegram.ui.Components.wc.C(fb1Var, this.f37788f1.f38957a.first_name).j();
            }
        }
    }
}
