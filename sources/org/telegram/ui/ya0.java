package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ya0 implements nq {
    public final uy f43064a;
    public final int f43065b;

    public ya0(uy uyVar, int i10) {
        this.f43064a = uyVar;
        this.f43065b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f43064a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f43065b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
