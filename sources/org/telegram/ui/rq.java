package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rq extends dq {
    public final boolean[] f41219e1;
    public final long f41220f1;
    public final jr f41221g1;

    public rq(jr jrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f41221g1 = jrVar;
        this.f41219e1 = zArr;
        this.f41220f1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f41219e1[0]) {
            jr jrVar = this.f41221g1;
            if (org.telegram.ui.Components.xc.a(jrVar)) {
                long j10 = this.f41220f1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.xc.C(jrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.xc.C(jrVar, chat.title).j();
                }
            }
        }
    }
}
