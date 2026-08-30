package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class x91 extends jq {
    public final boolean[] f39883a1;
    public final ga1 f39884b1;
    public final z91 f39885c1;

    public x91(z91 z91Var, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, boolean[] zArr, ga1 ga1Var) {
        super(j10, j11, tL_chatAdminRights, null, tL_chatBannedRights, str, 0, true, z4, null);
        this.f39885c1 = z91Var;
        this.f39883a1 = zArr;
        this.f39884b1 = ga1Var;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f39883a1[0]) {
            ga1 ga1Var = this.f39884b1;
            if (org.telegram.ui.Components.qc.a(ga1Var)) {
                org.telegram.ui.Components.qc.C(ga1Var, this.f39885c1.f40742a.first_name).j();
            }
        }
    }
}
