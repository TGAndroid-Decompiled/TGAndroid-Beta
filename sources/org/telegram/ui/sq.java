package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class sq extends gq {
    public final boolean[] f43570c1;
    public final long f43571d1;
    public final kr f43572e1;

    public sq(kr krVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f43572e1 = krVar;
        this.f43570c1 = zArr;
        this.f43571d1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f43570c1[0]) {
            kr krVar = this.f43572e1;
            if (org.telegram.ui.Components.wc.a(krVar)) {
                long j10 = this.f43571d1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.wc.C(krVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.wc.C(krVar, chat.title).j();
                }
            }
        }
    }
}
