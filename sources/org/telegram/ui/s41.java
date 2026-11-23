package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class s41 extends np {
    public final boolean[] f51968d1;
    public final b51 f51969e1;
    public final u41 f51970f1;

    public s41(u41 u41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, b51 b51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f51970f1 = u41Var;
        this.f51968d1 = zArr;
        this.f51969e1 = b51Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f51968d1[0]) {
            b51 b51Var = this.f51969e1;
            if (org.telegram.ui.Components.kc.a(b51Var)) {
                org.telegram.ui.Components.kc.C(this.f51970f1.f52527a.first_name, b51Var).j();
            }
        }
    }
}
