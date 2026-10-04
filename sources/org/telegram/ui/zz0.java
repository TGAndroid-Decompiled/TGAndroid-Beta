package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zz0 implements jq {
    public final uy f43928a;
    public final a01 f43929b;

    public zz0(a01 a01Var, uy uyVar) {
        this.f43929b = a01Var;
        this.f43928a = uyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        a01 a01Var = this.f43929b;
        a01Var.f34629b.N1 = true;
        this.f43928a.removeSelfFromStack();
        NotificationCenter notificationCenter = a01Var.f34629b.getNotificationCenter();
        ProfileActivity profileActivity = a01Var.f34629b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        a01Var.f34629b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
