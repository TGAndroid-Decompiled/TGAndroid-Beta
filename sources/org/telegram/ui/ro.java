package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ro extends org.telegram.ui.Components.v70 {
    public final TLRPC.Chat f51682x;
    public final so f51683y;

    public ro(so soVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f51683y = soVar;
        this.f51682x = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.t70 t70Var) {
        vo voVar = this.f51683y.d;
        if (voVar.Q) {
            return false;
        }
        voVar.Q = true;
        e(new eh(13, this, t70Var), new yn(this, this.f51682x, z10, t70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.u70 u70Var) {
        vo voVar = this.f51683y.d;
        if (voVar.P) {
            return false;
        }
        voVar.P = true;
        e(new eh(13, this, u70Var), new yn(this, this.f51682x, z10, u70Var, 1));
        return true;
    }

    public final void e(eh ehVar, Runnable runnable) {
        vo voVar = this.f51683y.d;
        if (!org.telegram.messenger.v3.T(voVar.f52859f)) {
            voVar.getMessagesController().T(voVar.getParentActivity(), this.f51682x.f28431id, voVar, new oi.f0(22, this, runnable), ehVar);
        } else {
            runnable.run();
        }
    }
}
