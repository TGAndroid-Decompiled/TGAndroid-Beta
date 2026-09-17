package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ra1 extends pq {
    public final boolean[] f37170d1;
    public final ab1 f37171e1;
    public final ta1 f37172f1;

    public ra1(ta1 ta1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, ab1 ab1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f37172f1 = ta1Var;
        this.f37170d1 = zArr;
        this.f37171e1 = ab1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f37170d1[0]) {
            ab1 ab1Var = this.f37171e1;
            if (org.telegram.ui.Components.vc.a(ab1Var)) {
                org.telegram.ui.Components.vc.C(ab1Var, this.f37172f1.f37702a.first_name).j();
            }
        }
    }
}
