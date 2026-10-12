package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ya1 extends tq {
    public final boolean[] f42122d1;
    public final hb1 f42123e1;
    public final ab1 f42124f1;

    public ya1(ab1 ab1Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, boolean[] zArr, hb1 hb1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z10, null);
        this.f42124f1 = ab1Var;
        this.f42122d1 = zArr;
        this.f42123e1 = hb1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f42122d1[0]) {
            hb1 hb1Var = this.f42123e1;
            if (org.telegram.ui.Components.zc.a(hb1Var)) {
                org.telegram.ui.Components.zc.C(hb1Var, this.f42124f1.f34128a.first_name).j();
            }
        }
    }
}
