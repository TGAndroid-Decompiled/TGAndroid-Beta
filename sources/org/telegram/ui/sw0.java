package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sw0 extends iq {
    public final boolean[] f41659c1;
    public final TLRPC.User f41660d1;
    public final ProfileActivity f41661e1;

    public sw0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f41661e1 = profileActivity;
        this.f41659c1 = zArr;
        this.f41660d1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f41659c1[0]) {
            ProfileActivity profileActivity = this.f41661e1;
            if (org.telegram.ui.Components.cc.a(profileActivity)) {
                org.telegram.ui.Components.cc.C(this.f41660d1.first_name, profileActivity).j();
            }
        }
    }
}
