package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class uz0 implements hq {
    public final py f41958a;
    public final vz0 f41959b;

    public uz0(vz0 vz0Var, py pyVar) {
        this.f41959b = vz0Var;
        this.f41958a = pyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        vz0 vz0Var = this.f41959b;
        vz0Var.f42235b.K1 = true;
        this.f41958a.removeSelfFromStack();
        NotificationCenter notificationCenter = vz0Var.f42235b.getNotificationCenter();
        ProfileActivity profileActivity = vz0Var.f42235b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        vz0Var.f42235b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
