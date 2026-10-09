package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class wa0 implements kq {
    public final ty f43149a;
    public final int f43150b;

    public wa0(ty tyVar, int i10) {
        this.f43149a = tyVar;
        this.f43150b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f43149a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f43150b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
