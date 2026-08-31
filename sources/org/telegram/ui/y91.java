package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class y91 extends kq {
    public final boolean[] f43587a1;
    public final ha1 f43588b1;
    public final aa1 f43589c1;

    public y91(aa1 aa1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, ha1 ha1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.f43589c1 = aa1Var;
        this.f43587a1 = zArr;
        this.f43588b1 = ha1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f43587a1[0]) {
            ha1 ha1Var = this.f43588b1;
            if (org.telegram.ui.Components.qc.a(ha1Var)) {
                org.telegram.ui.Components.qc.C(ha1Var, this.f43589c1.f35107a.first_name).j();
            }
        }
    }
}
