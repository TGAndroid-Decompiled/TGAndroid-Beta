package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class qp extends org.telegram.ui.Components.v80 {
    public final TLRPC.Chat f36976w;
    public final rp f36977x;

    public qp(rp rpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36977x = rpVar;
        this.f36976w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.t80 t80Var) {
        up upVar = this.f36977x.d;
        if (upVar.P) {
            return false;
        }
        upVar.P = true;
        e(new gh(21, this, t80Var), new ai.s4(this, this.f36976w, z10, t80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.u80 u80Var) {
        up upVar = this.f36977x.d;
        if (upVar.O) {
            return false;
        }
        upVar.O = true;
        e(new gh(21, this, u80Var), new ai.s4(this, this.f36976w, z10, u80Var, 15));
        return true;
    }

    public final void e(gh ghVar, Runnable runnable) {
        up upVar = this.f36977x.d;
        if (!ChatObject.isChannel(upVar.f38203f)) {
            upVar.getMessagesController().convertToMegaGroup(upVar.getParentActivity(), this.f36976w.f18343id, upVar, new l4(16, this, runnable), ghVar);
        } else {
            runnable.run();
        }
    }
}
