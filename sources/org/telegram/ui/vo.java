package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class vo implements org.telegram.ui.Components.r90 {
    public final Context f44387a;
    public final cp f44388b;

    public vo(cp cpVar, Context context) {
        this.f44388b = cpVar;
        this.f44387a = context;
    }

    @Override
    public final void d() {
        this.f44388b.Z(true);
    }

    @Override
    public final void e() {
        cp cpVar = this.f44388b;
        org.telegram.ui.Components.o70 o70Var = new org.telegram.ui.Components.o70(this.f44387a, cpVar.f38416l0, cpVar.Y, cpVar.f38419o0, cpVar, cpVar.Z, true, ChatObject.isChannel(cpVar.X));
        cp cpVar2 = this.f44388b;
        cpVar2.f38420p0 = o70Var;
        cpVar2.f38420p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void k() {
    }
}
