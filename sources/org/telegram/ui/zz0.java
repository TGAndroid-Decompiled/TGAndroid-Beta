package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zz0 implements jq {
    public final uy f43920a;
    public final a01 f43921b;

    public zz0(a01 a01Var, uy uyVar) {
        this.f43921b = a01Var;
        this.f43920a = uyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        a01 a01Var = this.f43921b;
        a01Var.f34622b.N1 = true;
        this.f43920a.removeSelfFromStack();
        NotificationCenter notificationCenter = a01Var.f34622b.getNotificationCenter();
        ProfileActivity profileActivity = a01Var.f34622b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        a01Var.f34622b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
