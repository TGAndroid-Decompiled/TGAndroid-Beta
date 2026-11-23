package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qo extends org.telegram.ui.Components.s70 {
    public final TLRPC.Chat f51497x;
    public final ro f51498y;

    public qo(ro roVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f51498y = roVar;
        this.f51497x = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.q70 q70Var) {
        uo uoVar = this.f51498y.d;
        if (uoVar.Q) {
            return false;
        }
        uoVar.Q = true;
        e(new ah(15, this, q70Var), new xn(this, this.f51497x, z10, q70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.r70 r70Var) {
        uo uoVar = this.f51498y.d;
        if (uoVar.P) {
            return false;
        }
        uoVar.P = true;
        e(new ah(15, this, r70Var), new xn(this, this.f51497x, z10, r70Var, 1));
        return true;
    }

    public final void e(ah ahVar, Runnable runnable) {
        uo uoVar = this.f51498y.d;
        if (!org.telegram.messenger.v3.T(uoVar.f52700f)) {
            uoVar.getMessagesController().T(uoVar.getParentActivity(), this.f51497x.f28492id, uoVar, new oi.f0(22, this, runnable), ahVar);
        } else {
            runnable.run();
        }
    }
}
