package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class qz0 implements dq {
    public final cy f42955a;
    public final rz0 f42956b;

    public qz0(rz0 rz0Var, cy cyVar) {
        this.f42956b = rz0Var;
        this.f42955a = cyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        rz0 rz0Var = this.f42956b;
        rz0Var.f43312b.N1 = true;
        this.f42955a.removeSelfFromStack();
        NotificationCenter notificationCenter = rz0Var.f43312b.getNotificationCenter();
        ProfileActivity profileActivity = rz0Var.f43312b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        rz0Var.f43312b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
