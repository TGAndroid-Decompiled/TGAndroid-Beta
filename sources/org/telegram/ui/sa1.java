package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sa1 extends nq {
    public final boolean[] f41655d1;
    public final bb1 f41656e1;
    public final ua1 f41657f1;

    public sa1(ua1 ua1Var, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, bb1 bb1Var) {
        super(j3, j10, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f41657f1 = ua1Var;
        this.f41655d1 = zArr;
        this.f41656e1 = bb1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f41655d1[0]) {
            bb1 bb1Var = this.f41656e1;
            if (org.telegram.ui.Components.ad.a(bb1Var)) {
                org.telegram.ui.Components.ad.C(bb1Var, this.f41657f1.f42387a.first_name).j();
            }
        }
    }
}
