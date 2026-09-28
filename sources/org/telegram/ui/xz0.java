package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class xz0 implements hq {
    public final qy f40009a;
    public final yz0 f40010b;

    public xz0(yz0 yz0Var, qy qyVar) {
        this.f40010b = yz0Var;
        this.f40009a = qyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        yz0 yz0Var = this.f40010b;
        yz0Var.f40296b.N1 = true;
        this.f40009a.removeSelfFromStack();
        NotificationCenter notificationCenter = yz0Var.f40296b.getNotificationCenter();
        ProfileActivity profileActivity = yz0Var.f40296b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        yz0Var.f40296b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
