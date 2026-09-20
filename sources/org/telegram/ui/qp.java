package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class qp extends org.telegram.ui.Components.s80 {
    public final TLRPC.Chat f36953w;
    public final rp f36954x;

    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36954x = rpVar;
        this.f36953w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.q80 q80Var) {
        up upVar = this.f36954x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new gh(21, this, q80Var), new ai.s4(this, this.f36953w, z10, q80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.r80 r80Var) {
        up upVar = this.f36954x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new gh(21, this, r80Var), new ai.s4(this, this.f36953w, z10, r80Var, 15));
        return true;
    }

    public final void e(gh ghVar, Runnable runnable) {
        up upVar = this.f36954x.d;
        if (!ChatObject.isChannel(upVar.f38182f)) {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.f36953w.f18328id, upVar, new l4(16, this, runnable), ghVar);
        } else {
            runnable.run();
        }
    }
}
