package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class sa0 implements hq {
    public final qy f37650a;
    public final int f37651b;

    public sa0(qy qyVar, int i10) {
        this.f37650a = qyVar;
        this.f37651b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f37650a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f37651b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
