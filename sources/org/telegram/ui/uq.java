package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uq extends iq {
    public final boolean[] f44087c1;
    public final long f44088d1;
    public final mr f44089e1;

    public uq(mr mrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f44089e1 = mrVar;
        this.f44087c1 = zArr;
        this.f44088d1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f44087c1[0]) {
            mr mrVar = this.f44089e1;
            if (org.telegram.ui.Components.wc.a(mrVar)) {
                long j10 = this.f44088d1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.wc.C(mrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.wc.C(mrVar, chat.title).j();
                }
            }
        }
    }
}
