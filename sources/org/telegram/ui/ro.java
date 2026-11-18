package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ro extends org.telegram.ui.Components.t70 {
    public final TLRPC.Chat f51718x;
    public final so f51719y;

    public ro(so soVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f51719y = soVar;
        this.f51718x = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.r70 r70Var) {
        vo voVar = this.f51719y.d;
        if (voVar.Q) {
            return false;
        }
        voVar.Q = true;
        e(new ci(11, this, r70Var), new yn(this, this.f51718x, z10, r70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.s70 s70Var) {
        vo voVar = this.f51719y.d;
        if (voVar.P) {
            return false;
        }
        voVar.P = true;
        e(new ci(11, this, s70Var), new yn(this, this.f51718x, z10, s70Var, 1));
        return true;
    }

    public final void e(ci ciVar, Runnable runnable) {
        vo voVar = this.f51719y.d;
        if (!org.telegram.messenger.v3.T(voVar.f52827f)) {
            voVar.getMessagesController().T(voVar.getParentActivity(), this.f51718x.f28405id, voVar, new oi.e0(22, this, runnable), ciVar);
        } else {
            runnable.run();
        }
    }
}
