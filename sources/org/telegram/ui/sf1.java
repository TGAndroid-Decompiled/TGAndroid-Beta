package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class sf1 extends org.telegram.ui.Components.z70 {
    public final long A0;
    public final uf1 B0;

    public sf1(uf1 uf1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.m2 m2Var, long j11) {
        super(context, i10, hVar, j10, m2Var, null);
        this.B0 = uf1Var;
        this.A0 = j11;
    }

    @Override
    public final boolean Y() {
        TLRPC.Chat chat = this.B0.f40392b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
