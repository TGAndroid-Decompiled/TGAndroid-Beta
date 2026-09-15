package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wz0 extends pq {
    public final boolean[] f39417d1;
    public final TLRPC.User f39418e1;
    public final ProfileActivity f39419f1;

    public wz0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f39419f1 = profileActivity;
        this.f39417d1 = zArr;
        this.f39418e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f39417d1[0]) {
            ProfileActivity profileActivity = this.f39419f1;
            if (org.telegram.ui.Components.vc.a(profileActivity)) {
                org.telegram.ui.Components.vc.C(profileActivity, this.f39418e1.first_name).j();
            }
        }
    }
}
