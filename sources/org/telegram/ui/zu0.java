package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zu0 extends ip {
    public final boolean[] f52753d1;
    public final TLRPC.User f52754e1;
    public final ProfileActivity f52755f1;

    public zu0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i3, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i3, true, false, null);
        this.f52755f1 = profileActivity;
        this.f52753d1 = zArr;
        this.f52754e1 = user;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f52753d1[0]) {
            ProfileActivity profileActivity = this.f52755f1;
            if (org.telegram.ui.Components.fc.a(profileActivity)) {
                org.telegram.ui.Components.fc.C(this.f52754e1.first_name, profileActivity).j();
            }
        }
    }
}
