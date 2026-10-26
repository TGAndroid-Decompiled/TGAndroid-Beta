package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class qz0 implements dq {
    public final cy f42958a;
    public final rz0 f42959b;

    public qz0(rz0 rz0Var, cy cyVar) {
        this.f42959b = rz0Var;
        this.f42958a = cyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        rz0 rz0Var = this.f42959b;
        rz0Var.f43315b.N1 = true;
        this.f42958a.removeSelfFromStack();
        NotificationCenter notificationCenter = rz0Var.f43315b.getNotificationCenter();
        ProfileActivity profileActivity = rz0Var.f43315b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        rz0Var.f43315b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
