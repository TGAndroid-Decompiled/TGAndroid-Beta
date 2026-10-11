package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class qp extends org.telegram.ui.Components.m90 {
    public final TLRPC.Chat f41248w;
    public final rp f41249x;

    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f41249x = rpVar;
        this.f41248w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.k90 k90Var) {
        up upVar = this.f41249x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new ug(22, this, k90Var), new ai.t4(this, this.f41248w, z10, k90Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.l90 l90Var) {
        up upVar = this.f41249x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new ug(22, this, l90Var), new ai.t4(this, this.f41248w, z10, l90Var, 15));
        return true;
    }

    public final void e(ug ugVar, Runnable runnable) {
        up upVar = this.f41249x.d;
        if (!ChatObject.isChannel(upVar.f42772f)) {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.f41248w.f20068id, upVar, new m4.v0(19, this, runnable), ugVar);
        } else {
            runnable.run();
        }
    }
}
