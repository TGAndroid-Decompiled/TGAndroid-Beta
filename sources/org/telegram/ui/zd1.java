package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class zd1 extends org.telegram.ui.Components.v70 {
    public final long A0;
    public final be1 B0;

    public zd1(be1 be1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, long j11) {
        super(context, i10, hVar, j10, n2Var, null);
        this.B0 = be1Var;
        this.A0 = j11;
    }

    @Override
    public final boolean Y() {
        TLRPC.Chat chat = this.B0.f35623b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
