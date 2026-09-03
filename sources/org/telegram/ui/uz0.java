package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class uz0 implements iq {
    public final qy f38933a;
    public final vz0 f38934b;

    public uz0(vz0 vz0Var, qy qyVar) {
        this.f38934b = vz0Var;
        this.f38933a = qyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        vz0 vz0Var = this.f38934b;
        vz0Var.f39224b.K1 = true;
        this.f38933a.removeSelfFromStack();
        NotificationCenter notificationCenter = vz0Var.f39224b.getNotificationCenter();
        ProfileActivity profileActivity = vz0Var.f39224b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        vz0Var.f39224b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
