package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class ue1 extends org.telegram.ui.Components.e70 {
    public final long f41915x0;
    public final we1 f41916y0;

    public ue1(we1 we1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, long j11) {
        super(context, i10, hVar, j10, p2Var, null);
        this.f41916y0 = we1Var;
        this.f41915x0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.f41916y0.f42454b.getMessagesController().getChat(Long.valueOf(this.f41915x0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
