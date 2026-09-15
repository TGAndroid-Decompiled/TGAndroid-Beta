package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ya0 implements mq {
    public final uy f39793a;
    public final int f39794b;

    public ya0(uy uyVar, int i10) {
        this.f39793a = uyVar;
        this.f39794b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f39793a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f39794b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
