package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class va0 implements kq {
    public final sy f42974a;
    public final int f42975b;

    public va0(sy syVar, int i10) {
        this.f42974a = syVar;
        this.f42975b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f42974a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f42975b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
