package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class u41 extends mp {
    public final boolean[] f50286c1;
    public final d51 f50287d1;
    public final w41 f50288e1;

    public u41(w41 w41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, boolean[] zArr, d51 d51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z9, null);
        this.f50288e1 = w41Var;
        this.f50286c1 = zArr;
        this.f50287d1 = d51Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.f50286c1[0]) {
            d51 d51Var = this.f50287d1;
            if (org.telegram.ui.Components.hc.a(d51Var)) {
                org.telegram.ui.Components.hc.C(this.f50288e1.f50866a.first_name, d51Var).j();
            }
        }
    }
}
