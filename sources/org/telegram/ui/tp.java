package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class tp extends org.telegram.ui.Components.q90 {
    public final TLRPC.Chat f42262w;
    public final up f42263x;

    public tp(up upVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f42263x = upVar;
        this.f42262w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.o90 o90Var) {
        xp xpVar = this.f42263x.d;
        if (xpVar.P) {
            return false;
        }
        xpVar.P = true;
        e(new nh(20, this, o90Var), new ai.t4(this, this.f42262w, z10, o90Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.p90 p90Var) {
        xp xpVar = this.f42263x.d;
        if (xpVar.O) {
            return false;
        }
        xpVar.O = true;
        e(new nh(20, this, p90Var), new ai.t4(this, this.f42262w, z10, p90Var, 14));
        return true;
    }

    public final void e(nh nhVar, Runnable runnable) {
        xp xpVar = this.f42263x.d;
        if (!ChatObject.isChannel(xpVar.f44136f)) {
            xpVar.getMessagesController().convertToMegaGroup(xpVar.getParentActivity(), this.f42262w.f19803id, xpVar, new o(18, this, runnable), nhVar);
        } else {
            runnable.run();
        }
    }
}
