package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zy0 extends bq {
    public final boolean[] f43825d1;
    public final TLRPC.User f43826e1;
    public final ProfileActivity f43827f1;

    public zy0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f43827f1 = profileActivity;
        this.f43825d1 = zArr;
        this.f43826e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f43825d1[0]) {
            ProfileActivity profileActivity = this.f43827f1;
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.C(profileActivity, this.f43826e1.first_name).j();
            }
        }
    }
}
