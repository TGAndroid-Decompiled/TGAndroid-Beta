package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wz0 extends nq {
    public final boolean[] f43818d1;
    public final TLRPC.User f43819e1;
    public final ProfileActivity f43820f1;

    public wz0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f43820f1 = profileActivity;
        this.f43818d1 = zArr;
        this.f43819e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f43818d1[0]) {
            ProfileActivity profileActivity = this.f43820f1;
            if (org.telegram.ui.Components.ad.a(profileActivity)) {
                org.telegram.ui.Components.ad.C(profileActivity, this.f43819e1.first_name).j();
            }
        }
    }
}
