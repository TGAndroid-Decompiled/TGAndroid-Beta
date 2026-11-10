package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class v41 extends mp {
    public final boolean[] f50630c1;
    public final e51 f50631d1;
    public final x41 f50632e1;

    public v41(x41 x41Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, boolean[] zArr, e51 e51Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z9, null);
        this.f50632e1 = x41Var;
        this.f50630c1 = zArr;
        this.f50631d1 = e51Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (!z9 && z10 && this.f50630c1[0]) {
            e51 e51Var = this.f50631d1;
            if (org.telegram.ui.Components.gc.a(e51Var)) {
                org.telegram.ui.Components.gc.C(this.f50632e1.f51520a.first_name, e51Var).j();
            }
        }
    }
}
