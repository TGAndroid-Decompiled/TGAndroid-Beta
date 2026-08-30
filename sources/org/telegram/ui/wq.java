package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wq extends jq {
    public final boolean[] f39781a1;
    public final long f39782b1;
    public final pr f39783c1;

    public wq(pr prVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f39783c1 = prVar;
        this.f39781a1 = zArr;
        this.f39782b1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (!z4 && z10 && this.f39781a1[0]) {
            pr prVar = this.f39783c1;
            if (org.telegram.ui.Components.qc.a(prVar)) {
                long j10 = this.f39782b1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.qc.C(prVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.qc.C(prVar, chat.title).j();
                }
            }
        }
    }
}
