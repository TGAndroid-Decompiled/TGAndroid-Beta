package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements jq {
    public final uy f42010a;
    public final int f42011b;

    public wa0(uy uyVar, int i10) {
        this.f42010a = uyVar;
        this.f42011b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f42010a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f42011b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
