package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qo extends org.telegram.ui.Components.v70 {
    public final TLRPC.Chat f51248x;
    public final ro f51249y;

    public qo(ro roVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f51249y = roVar;
        this.f51248x = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.t70 t70Var) {
        uo uoVar = this.f51249y.d;
        if (uoVar.Q) {
            return false;
        }
        uoVar.Q = true;
        e(new ci(11, this, t70Var), new xn(this, this.f51248x, z10, t70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.u70 u70Var) {
        uo uoVar = this.f51249y.d;
        if (uoVar.P) {
            return false;
        }
        uoVar.P = true;
        e(new ci(11, this, u70Var), new xn(this, this.f51248x, z10, u70Var, 1));
        return true;
    }

    public final void e(ci ciVar, Runnable runnable) {
        uo uoVar = this.f51249y.d;
        if (!org.telegram.messenger.v3.T(uoVar.f52601f)) {
            uoVar.getMessagesController().T(uoVar.getParentActivity(), this.f51248x.f28398id, uoVar, new oi.e0(22, this, runnable), ciVar);
        } else {
            runnable.run();
        }
    }
}
