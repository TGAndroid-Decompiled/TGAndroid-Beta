package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class tv0 implements jp {
    public final zw f50348a;
    public final uv0 f50349b;

    public tv0(uv0 uv0Var, zw zwVar) {
        this.f50349b = uv0Var;
        this.f50348a = zwVar;
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        ProfileActivity profileActivity = this.f50349b.f50573b;
        profileActivity.M1 = true;
        this.f50348a.removeSelfFromStack();
        org.telegram.messenger.qs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.qs.f25080t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
