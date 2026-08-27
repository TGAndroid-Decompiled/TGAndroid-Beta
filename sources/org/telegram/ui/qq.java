package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class qq extends dq {
    public final boolean[] Z0;

    public final long f41730a1;

    public final lr f41731b1;

    public qq(lr lrVar, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, long j12) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f41731b1 = lrVar;
        this.Z0 = zArr;
        this.f41730a1 = j12;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            lr lrVar = this.f41731b1;
            if (org.telegram.ui.Components.mc.a(lrVar)) {
                long j10 = this.f41730a1;
                if (j10 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        org.telegram.ui.Components.mc.C(lrVar, user.first_name).j();
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    org.telegram.ui.Components.mc.C(lrVar, chat.title).j();
                }
            }
        }
    }
}
