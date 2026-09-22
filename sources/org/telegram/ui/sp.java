package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class sp extends org.telegram.ui.Components.k80 {
    public final TLRPC.Chat f37430w;
    public final tp f37431x;

    public sp(tp tpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f37431x = tpVar;
        this.f37430w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.i80 i80Var) {
        wp wpVar = this.f37431x.d;
        if (wpVar.P) {
            return false;
        }
        wpVar.P = true;
        e(new uh(15, this, i80Var), new ai.s4(this, this.f37430w, z10, i80Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.j80 j80Var) {
        wp wpVar = this.f37431x.d;
        if (wpVar.O) {
            return false;
        }
        wpVar.O = true;
        e(new uh(15, this, j80Var), new ai.s4(this, this.f37430w, z10, j80Var, 14));
        return true;
    }

    public final void e(uh uhVar, Runnable runnable) {
        wp wpVar = this.f37431x.d;
        if (!ChatObject.isChannel(wpVar.f39346f)) {
            wpVar.getMessagesController().convertToMegaGroup(wpVar.getParentActivity(), this.f37430w.f18109id, wpVar, new x5(15, this, runnable), uhVar);
        } else {
            runnable.run();
        }
    }
}
