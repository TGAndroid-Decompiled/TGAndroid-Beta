package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class xa0 implements oq {
    public final wy f38652a;
    public final int f38653b;

    public xa0(wy wyVar, int i10) {
        this.f38652a = wyVar;
        this.f38653b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f38652a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f38653b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
