package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class tp extends org.telegram.ui.Components.q90 {
    public final TLRPC.Chat f42260w;
    public final up f42261x;

    public tp(up upVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f42261x = upVar;
        this.f42260w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.o90 o90Var) {
        xp xpVar = this.f42261x.d;
        if (xpVar.P) {
            return false;
        }
        xpVar.P = true;
        e(new nh(20, this, o90Var), new ai.t4(this, this.f42260w, z10, o90Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.p90 p90Var) {
        xp xpVar = this.f42261x.d;
        if (xpVar.O) {
            return false;
        }
        xpVar.O = true;
        e(new nh(20, this, p90Var), new ai.t4(this, this.f42260w, z10, p90Var, 14));
        return true;
    }

    public final void e(nh nhVar, Runnable runnable) {
        xp xpVar = this.f42261x.d;
        if (!ChatObject.isChannel(xpVar.f44131f)) {
            xpVar.getMessagesController().convertToMegaGroup(xpVar.getParentActivity(), this.f42260w.f19802id, xpVar, new o(18, this, runnable), nhVar);
        } else {
            runnable.run();
        }
    }
}
