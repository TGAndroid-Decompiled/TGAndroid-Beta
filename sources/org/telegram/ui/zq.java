package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zq extends mq {
    public final boolean[] f43859d1;
    public final long f43860e1;
    public final rr f43861f1;

    public zq(rr rrVar, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j11) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f43861f1 = rrVar;
        this.f43859d1 = zArr;
        this.f43860e1 = j11;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.f43859d1[0]) {
            rr rrVar = this.f43861f1;
            if (org.telegram.ui.Components.yc.a(rrVar)) {
                long j3 = this.f43860e1;
                if (j3 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
                    if (user != null) {
                        org.telegram.ui.Components.yc.C(rrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                if (chat != null) {
                    org.telegram.ui.Components.yc.C(rrVar, chat.title).j();
                }
            }
        }
    }
}
