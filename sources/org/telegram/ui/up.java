package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class up extends org.telegram.ui.Components.u80 {
    public final TLRPC.Chat f37302w;
    public final vp f37303x;

    public up(vp vpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f37303x = vpVar;
        this.f37302w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.s80 s80Var) {
        yp ypVar = this.f37303x.d;
        if (ypVar.P) {
            return false;
        }
        ypVar.P = true;
        e(new qh(18, this, s80Var), new bi.g2(this, this.f37302w, z10, s80Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.t80 t80Var) {
        yp ypVar = this.f37303x.d;
        if (ypVar.O) {
            return false;
        }
        ypVar.O = true;
        e(new qh(18, this, t80Var), new bi.g2(this, this.f37302w, z10, t80Var, 14));
        return true;
    }

    public final void e(qh qhVar, Runnable runnable) {
        yp ypVar = this.f37303x.d;
        if (!ChatObject.isChannel(ypVar.f39079f)) {
            ypVar.getMessagesController().convertToMegaGroup(ypVar.getParentActivity(), this.f37302w.f17195id, ypVar, new oe(11, this, runnable), qhVar);
        } else {
            runnable.run();
        }
    }
}
