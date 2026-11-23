package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class t41 extends np {
    public final boolean[] f52213d1;
    public final c51 f52214e1;
    public final v41 f52215f1;

    public t41(v41 v41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, c51 c51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f52215f1 = v41Var;
        this.f52213d1 = zArr;
        this.f52214e1 = c51Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f52213d1[0]) {
            c51 c51Var = this.f52214e1;
            if (org.telegram.ui.Components.lc.a(c51Var)) {
                org.telegram.ui.Components.lc.C(this.f52215f1.f52720a.first_name, c51Var).j();
            }
        }
    }
}
