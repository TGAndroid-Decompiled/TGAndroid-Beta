package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ty0 extends dq {
    public final boolean[] Z0;

    public final TLRPC.User f43030a1;

    public final ProfileActivity f43031b1;

    public ty0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f43031b1 = profileActivity;
        this.Z0 = zArr;
        this.f43030a1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            ProfileActivity profileActivity = this.f43031b1;
            if (org.telegram.ui.Components.mc.a(profileActivity)) {
                org.telegram.ui.Components.mc.C(profileActivity, this.f43030a1.first_name).j();
            }
        }
    }
}
