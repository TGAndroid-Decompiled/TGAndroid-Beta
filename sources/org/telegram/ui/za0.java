package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class za0 implements kq {
    public final uy f40030a;
    public final int f40031b;

    public za0(uy uyVar, int i10) {
        this.f40030a = uyVar;
        this.f40031b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f40030a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f40031b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
