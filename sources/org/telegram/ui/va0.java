package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class va0 implements kq {
    public final sy f42940a;
    public final int f42941b;

    public va0(sy syVar, int i10) {
        this.f42940a = syVar;
        this.f42941b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f42940a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f42941b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
