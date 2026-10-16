package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class wp extends org.telegram.ui.Components.l90 {
    public final TLRPC.Chat f41334w;
    public final xp f41335x;

    public wp(xp xpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f41335x = xpVar;
        this.f41334w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.i90 i90Var) {
        aq aqVar = this.f41335x.d;
        if (aqVar.P) {
            return false;
        }
        aqVar.P = true;
        e(new jd(29, this, i90Var), new bi.h4(this, this.f41334w, z10, i90Var, 14));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.j90 j90Var) {
        aq aqVar = this.f41335x.d;
        if (aqVar.O) {
            return false;
        }
        aqVar.O = true;
        e(new jd(29, this, j90Var), new bi.h4(this, this.f41334w, z10, j90Var, 13));
        return true;
    }

    public final void e(jd jdVar, Runnable runnable) {
        aq aqVar = this.f41335x.d;
        if (!ChatObject.isChannel(aqVar.f34051f)) {
            aqVar.getMessagesController().convertToMegaGroup(aqVar.getParentActivity(), this.f41334w.f18916id, aqVar, new m4.y0(20, this, runnable), jdVar);
        } else {
            runnable.run();
        }
    }
}
