package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qv0 implements hp {
    public final ww f49321a;
    public final rv0 f49322b;

    public qv0(rv0 rv0Var, ww wwVar) {
        this.f49322b = rv0Var;
        this.f49321a = wwVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f49322b.f49556b;
        profileActivity.M1 = true;
        this.f49321a.removeSelfFromStack();
        org.telegram.messenger.qs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.qs.f25076t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
