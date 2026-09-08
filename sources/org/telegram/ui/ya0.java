package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ya0 implements nq {
    public final uy f43091a;
    public final int f43092b;

    public ya0(uy uyVar, int i10) {
        this.f43091a = uyVar;
        this.f43092b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f43091a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f43092b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
