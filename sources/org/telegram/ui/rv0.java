package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rv0 implements kp {
    public final cx f51809a;
    public final sv0 f51810b;

    public rv0(sv0 sv0Var, cx cxVar) {
        this.f51810b = sv0Var;
        this.f51809a = cxVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f51810b.f52091b;
        profileActivity.N1 = true;
        this.f51809a.removeSelfFromStack();
        org.telegram.messenger.ls notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.ls.f25348t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
