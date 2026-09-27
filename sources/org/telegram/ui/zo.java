package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class zo implements org.telegram.ui.Components.h90 {
    public final Context f40560a;
    public final gp f40561b;

    public zo(gp gpVar, Context context) {
        this.f40561b = gpVar;
        this.f40560a = context;
    }

    @Override
    public final void e() {
        this.f40561b.X(true);
    }

    @Override
    public final void i() {
        gp gpVar = this.f40561b;
        org.telegram.ui.Components.e70 e70Var = new org.telegram.ui.Components.e70(this.f40560a, gpVar.f34000l0, gpVar.Y, gpVar.f34003o0, gpVar, gpVar.Z, true, ChatObject.isChannel(gpVar.X));
        gp gpVar2 = this.f40561b;
        gpVar2.f34004p0 = e70Var;
        gpVar2.f34004p0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void j() {
    }
}
