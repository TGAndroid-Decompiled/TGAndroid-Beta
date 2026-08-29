package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qq extends dq {
    public final boolean[] Z0;
    public final long f41760a1;
    public final jr f41761b1;

    public qq(jr jrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f41761b1 = jrVar;
        this.Z0 = zArr;
        this.f41760a1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            jr jrVar = this.f41761b1;
            if (org.telegram.ui.Components.tc.a(jrVar)) {
                long j10 = this.f41760a1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.tc.C(jrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.tc.C(jrVar, chat.title).j();
                }
            }
        }
    }
}
