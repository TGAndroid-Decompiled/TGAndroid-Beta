package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ua1 extends qq {
    public final boolean[] f42475d1;
    public final db1 f42476e1;
    public final wa1 f42477f1;

    public ua1(wa1 wa1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, db1 db1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f42477f1 = wa1Var;
        this.f42475d1 = zArr;
        this.f42476e1 = db1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f42475d1[0]) {
            db1 db1Var = this.f42476e1;
            if (org.telegram.ui.Components.zc.a(db1Var)) {
                org.telegram.ui.Components.zc.C(db1Var, this.f42477f1.f43117a.first_name).j();
            }
        }
    }
}
