package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qo extends org.telegram.ui.Components.f70 {
    public final TLRPC.Chat f49111x;
    public final ro f49112y;

    public qo(ro roVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f49112y = roVar;
        this.f49111x = chat2;
    }

    @Override
    public final boolean a(boolean z9, org.telegram.ui.Components.d70 d70Var) {
        uo uoVar = this.f49112y.d;
        if (uoVar.P) {
            return false;
        }
        uoVar.P = true;
        e(new oe(27, this, d70Var), new xn(this, this.f49111x, z9, d70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z9, org.telegram.ui.Components.e70 e70Var) {
        uo uoVar = this.f49112y.d;
        if (uoVar.O) {
            return false;
        }
        uoVar.O = true;
        e(new oe(27, this, e70Var), new xn(this, this.f49111x, z9, e70Var, 1));
        return true;
    }

    public final void e(oe oeVar, Runnable runnable) {
        uo uoVar = this.f49112y.d;
        if (!org.telegram.messenger.t3.T(uoVar.f50531f)) {
            uoVar.getMessagesController().T(uoVar.getParentActivity(), this.f49111x.f26960id, uoVar, new ni.c(20, this, runnable), oeVar);
        } else {
            runnable.run();
        }
    }
}
