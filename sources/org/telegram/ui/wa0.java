package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements kq {
    public final ty f43195a;
    public final int f43196b;

    public wa0(ty tyVar, int i10) {
        this.f43195a = tyVar;
        this.f43196b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f43195a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f43196b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
