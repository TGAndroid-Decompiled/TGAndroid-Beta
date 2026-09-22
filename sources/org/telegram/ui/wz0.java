package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wz0 extends nq {
    public final boolean[] f39295d1;
    public final TLRPC.User f39296e1;
    public final ProfileActivity f39297f1;

    public wz0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f39297f1 = profileActivity;
        this.f39295d1 = zArr;
        this.f39296e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f39295d1[0]) {
            ProfileActivity profileActivity = this.f39297f1;
            if (org.telegram.ui.Components.xc.a(profileActivity)) {
                org.telegram.ui.Components.xc.C(profileActivity, this.f39296e1.first_name).j();
            }
        }
    }
}
