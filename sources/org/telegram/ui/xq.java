package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xq extends kq {
    public final boolean[] f39962d1;
    public final long f39963e1;
    public final pr f39964f1;

    public xq(pr prVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f39964f1 = prVar;
        this.f39962d1 = zArr;
        this.f39963e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f39962d1[0]) {
            pr prVar = this.f39964f1;
            if (org.telegram.ui.Components.xc.a(prVar)) {
                long j3 = this.f39963e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.xc.C(prVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.xc.C(prVar, chat.title).j();
                }
            }
        }
    }
}
