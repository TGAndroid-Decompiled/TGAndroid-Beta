package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ty0 extends bq {
    public final boolean[] Z0;
    public final TLRPC.User f43085a1;
    public final ProfileActivity f43086b1;

    public ty0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i9, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i9, true, false, null);
        this.f43086b1 = profileActivity;
        this.Z0 = zArr;
        this.f43085a1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            ProfileActivity profileActivity = this.f43086b1;
            if (org.telegram.ui.Components.oc.a(profileActivity)) {
                org.telegram.ui.Components.oc.C(profileActivity, this.f43085a1.first_name).j();
            }
        }
    }
}
