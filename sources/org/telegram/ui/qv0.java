package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qv0 implements kp {
    public final cx f51363a;
    public final rv0 f51364b;

    public qv0(rv0 rv0Var, cx cxVar) {
        this.f51364b = rv0Var;
        this.f51363a = cxVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f51364b.f51776b;
        profileActivity.N1 = true;
        this.f51363a.removeSelfFromStack();
        org.telegram.messenger.ls notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.ls.f25384t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
