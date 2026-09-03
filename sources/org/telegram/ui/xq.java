package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xq extends kq {
    public final boolean[] f43435a1;
    public final long f43436b1;
    public final qr f43437c1;

    public xq(qr qrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f43437c1 = qrVar;
        this.f43435a1 = zArr;
        this.f43436b1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f43435a1[0]) {
            qr qrVar = this.f43437c1;
            if (org.telegram.ui.Components.qc.a(qrVar)) {
                long j10 = this.f43436b1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.qc.C(qrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.qc.C(qrVar, chat.title).j();
                }
            }
        }
    }
}
