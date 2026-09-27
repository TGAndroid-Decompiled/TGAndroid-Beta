package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zz0 implements iq {
    public final ty f40607a;
    public final a01 f40608b;

    public zz0(a01 a01Var, ty tyVar) {
        this.f40608b = a01Var;
        this.f40607a = tyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        a01 a01Var = this.f40608b;
        a01Var.f31935b.N1 = true;
        this.f40607a.removeSelfFromStack();
        NotificationCenter notificationCenter = a01Var.f31935b.getNotificationCenter();
        ProfileActivity profileActivity = a01Var.f31935b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        a01Var.f31935b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
