package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class va0 implements iq {
    public final ty f38533a;
    public final int f38534b;

    public va0(ty tyVar, int i10) {
        this.f38533a = tyVar;
        this.f38534b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f38533a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f38534b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
