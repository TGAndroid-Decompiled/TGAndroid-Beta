package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qv0 implements kp {
    public final cx f51345a;
    public final rv0 f51346b;

    public qv0(rv0 rv0Var, cx cxVar) {
        this.f51346b = rv0Var;
        this.f51345a = cxVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f51346b.f51808b;
        profileActivity.N1 = true;
        this.f51345a.removeSelfFromStack();
        org.telegram.messenger.ks notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.ks.f25192t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
