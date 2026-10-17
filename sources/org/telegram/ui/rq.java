package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rq extends dq {
    public final boolean[] f40793d1;
    public final long f40794e1;
    public final jr f40795f1;

    public rq(jr jrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f40795f1 = jrVar;
        this.f40793d1 = zArr;
        this.f40794e1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f40793d1[0]) {
            jr jrVar = this.f40795f1;
            if (org.telegram.ui.Components.xc.a(jrVar)) {
                long j10 = this.f40794e1;
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
