package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ta0 implements iq {
    public final ry f37591a;
    public final int f37592b;

    public ta0(ry ryVar, int i10) {
        this.f37591a = ryVar;
        this.f37592b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f37591a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f37592b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
