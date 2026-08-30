package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class se1 extends org.telegram.ui.Components.c70 {
    public final long f38322x0;
    public final ue1 f38323y0;

    public se1(ue1 ue1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, long j11) {
        super(context, i10, hVar, j10, p2Var, null);
        this.f38323y0 = ue1Var;
        this.f38322x0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.f38323y0.f38924b.getMessagesController().getChat(Long.valueOf(this.f38322x0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
