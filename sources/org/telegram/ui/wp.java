package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class wp extends org.telegram.ui.Components.l90 {
    public final TLRPC.Chat f41630w;
    public final xp f41631x;

    public wp(xp xpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f41631x = xpVar;
        this.f41630w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.i90 i90Var) {
        aq aqVar = this.f41631x.d;
        if (aqVar.P) {
            return false;
        }
        aqVar.P = true;
        e(new rp(4, this, i90Var), new bi.h4(this, this.f41630w, z10, i90Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.j90 j90Var) {
        aq aqVar = this.f41631x.d;
        if (aqVar.O) {
            return false;
        }
        aqVar.O = true;
        e(new rp(4, this, j90Var), new bi.h4(this, this.f41630w, z10, j90Var, 14));
        return true;
    }

    public final void e(rp rpVar, Runnable runnable) {
        aq aqVar = this.f41631x.d;
        if (!ChatObject.isChannel(aqVar.f34295f)) {
            aqVar.getMessagesController().convertToMegaGroup(aqVar.getParentActivity(), this.f41630w.f19216id, aqVar, new m4.z0(21, this, runnable), rpVar);
        } else {
            runnable.run();
        }
    }
}
