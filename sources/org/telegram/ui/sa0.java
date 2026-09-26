package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class sa0 implements hq {
    public final qy f37664a;
    public final int f37665b;

    public sa0(qy qyVar, int i10) {
        this.f37664a = qyVar;
        this.f37665b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f37664a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f37665b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
