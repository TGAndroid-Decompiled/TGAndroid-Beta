package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class t41 extends kp {
    public final boolean[] f49921c1;
    public final c51 f49922d1;
    public final v41 f49923e1;

    public t41(v41 v41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, boolean[] zArr, c51 c51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z9, null);
        this.f49923e1 = v41Var;
        this.f49921c1 = zArr;
        this.f49922d1 = c51Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.f49921c1[0]) {
            c51 c51Var = this.f49922d1;
            if (org.telegram.ui.Components.hc.a(c51Var)) {
                org.telegram.ui.Components.hc.C(this.f49923e1.f50573a.first_name, c51Var).j();
            }
        }
    }
}
