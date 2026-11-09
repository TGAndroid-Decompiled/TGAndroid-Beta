package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sv0 implements jp {
    public final yw f49999a;
    public final tv0 f50000b;

    public sv0(tv0 tv0Var, yw ywVar) {
        this.f50000b = tv0Var;
        this.f49999a = ywVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f50000b.f50246b;
        profileActivity.M1 = true;
        this.f49999a.removeSelfFromStack();
        org.telegram.messenger.qs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.qs.f25076t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
