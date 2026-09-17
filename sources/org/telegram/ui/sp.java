package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class sp extends org.telegram.ui.Components.k80 {
    public final TLRPC.Chat f37537w;
    public final tp f37538x;

    public sp(tp tpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f37538x = tpVar;
        this.f37537w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.i80 i80Var) {
        wp wpVar = this.f37538x.d;
        if (wpVar.P) {
            return false;
        }
        wpVar.P = true;
        e(new wh(15, this, i80Var), new ai.s4(this, this.f37537w, z10, i80Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.j80 j80Var) {
        wp wpVar = this.f37538x.d;
        if (wpVar.O) {
            return false;
        }
        wpVar.O = true;
        e(new wh(15, this, j80Var), new ai.s4(this, this.f37537w, z10, j80Var, 14));
        return true;
    }

    public final void e(wh whVar, Runnable runnable) {
        wp wpVar = this.f37538x.d;
        if (!ChatObject.isChannel(wpVar.f39120f)) {
            wpVar.getMessagesController().convertToMegaGroup(wpVar.getParentActivity(), this.f37537w.f18121id, wpVar, new x5(15, this, runnable), whVar);
        } else {
            runnable.run();
        }
    }
}
