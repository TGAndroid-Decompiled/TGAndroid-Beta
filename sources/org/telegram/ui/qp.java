package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class qp extends org.telegram.ui.Components.t80 {
    public final TLRPC.Chat f36867w;
    public final rp f36868x;

    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36868x = rpVar;
        this.f36867w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.r80 r80Var) {
        up upVar = this.f36868x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new qh(19, this, r80Var), new ai.s4(this, this.f36867w, z10, r80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.s80 s80Var) {
        up upVar = this.f36868x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new qh(19, this, s80Var), new ai.s4(this, this.f36867w, z10, s80Var, 15));
        return true;
    }

    public final void e(qh qhVar, Runnable runnable) {
        up upVar = this.f36868x.d;
        if (!ChatObject.isChannel(upVar.f38073f)) {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.f36867w.f18296id, upVar, new l4(16, this, runnable), qhVar);
        } else {
            runnable.run();
        }
    }
}
