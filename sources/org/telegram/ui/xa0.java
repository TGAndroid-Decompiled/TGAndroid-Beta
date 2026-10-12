package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements nq {
    public final vy f43870a;
    public final int f43871b;

    public xa0(vy vyVar, int i10) {
        this.f43870a = vyVar;
        this.f43871b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f43870a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f43871b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
