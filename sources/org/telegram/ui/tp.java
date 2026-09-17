package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class tp extends org.telegram.ui.Components.k80 {
    public final TLRPC.Chat f40808w;
    public final up f40809x;

    public tp(up upVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f40809x = upVar;
        this.f40808w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.i80 i80Var) {
        xp xpVar = this.f40809x.d;
        if (xpVar.P) {
            return false;
        }
        xpVar.P = true;
        e(new fh(21, this, i80Var), new bi.e4(this, this.f40808w, z10, i80Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.j80 j80Var) {
        xp xpVar = this.f40809x.d;
        if (xpVar.O) {
            return false;
        }
        xpVar.O = true;
        e(new fh(21, this, j80Var), new bi.e4(this, this.f40808w, z10, j80Var, 14));
        return true;
    }

    public final void e(fh fhVar, Runnable runnable) {
        xp xpVar = this.f40809x.d;
        if (!ChatObject.isChannel(xpVar.f42852f)) {
            xpVar.getMessagesController().convertToMegaGroup(xpVar.getParentActivity(), this.f40808w.f19869id, xpVar, new m4(16, this, runnable), fhVar);
        } else {
            runnable.run();
        }
    }
}
