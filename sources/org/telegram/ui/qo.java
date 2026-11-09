package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qo extends org.telegram.ui.Components.g70 {
    public final TLRPC.Chat f49108x;
    public final ro f49109y;

    public qo(ro roVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f49109y = roVar;
        this.f49108x = chat2;
    }

    @Override
    public final boolean a(boolean z9, org.telegram.ui.Components.e70 e70Var) {
        uo uoVar = this.f49109y.d;
        if (uoVar.P) {
            return false;
        }
        uoVar.P = true;
        e(new rf(26, this, e70Var), new xn(this, this.f49108x, z9, e70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z9, org.telegram.ui.Components.f70 f70Var) {
        uo uoVar = this.f49109y.d;
        if (uoVar.O) {
            return false;
        }
        uoVar.O = true;
        e(new rf(26, this, f70Var), new xn(this, this.f49108x, z9, f70Var, 1));
        return true;
    }

    public final void e(rf rfVar, Runnable runnable) {
        uo uoVar = this.f49109y.d;
        if (!org.telegram.messenger.t3.T(uoVar.f50435f)) {
            uoVar.getMessagesController().T(uoVar.getParentActivity(), this.f49108x.f26956id, uoVar, new ni.c(20, this, runnable), rfVar);
        } else {
            runnable.run();
        }
    }
}
