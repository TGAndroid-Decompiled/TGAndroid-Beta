package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class qp extends org.telegram.ui.Components.n90 {
    public final TLRPC.Chat f41204w;
    public final rp f41205x;

    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f41205x = rpVar;
        this.f41204w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.l90 l90Var) {
        up upVar = this.f41205x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new sg(23, this, l90Var), new ai.t4(this, this.f41204w, z10, l90Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.m90 m90Var) {
        up upVar = this.f41205x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new sg(23, this, m90Var), new ai.t4(this, this.f41204w, z10, m90Var, 15));
        return true;
    }

    public final void e(sg sgVar, Runnable runnable) {
        up upVar = this.f41205x.d;
        if (!ChatObject.isChannel(upVar.f42548f)) {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.f41204w.f20042id, upVar, new o(18, this, runnable), sgVar);
        } else {
            runnable.run();
        }
    }
}
