package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ya0 implements nq {
    public final uy f43065a;
    public final int f43066b;

    public ya0(uy uyVar, int i10) {
        this.f43065a = uyVar;
        this.f43066b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f43065a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f43066b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
