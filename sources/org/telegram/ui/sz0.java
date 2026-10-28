package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class sz0 implements fq {
    public final ey f43435a;
    public final tz0 f43436b;

    public sz0(tz0 tz0Var, ey eyVar) {
        this.f43436b = tz0Var;
        this.f43435a = eyVar;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        tz0 tz0Var = this.f43436b;
        tz0Var.f43810b.N1 = true;
        this.f43435a.removeSelfFromStack();
        NotificationCenter notificationCenter = tz0Var.f43810b.getNotificationCenter();
        ProfileActivity profileActivity = tz0Var.f43810b;
        int i11 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(profileActivity, i11);
        tz0Var.f43810b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
