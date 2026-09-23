package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
public final class zo implements org.telegram.ui.Components.v80 {
    public final Context f40199a;
    public final gp f40200b;

    public zo(gp gpVar, Context context) {
        this.f40200b = gpVar;
        this.f40199a = context;
    }

    @Override
    public final void c() {
        this.f40200b.X(true);
    }

    @Override
    public final void i() {
        gp gpVar = this.f40200b;
        org.telegram.ui.Components.s60 s60Var = new org.telegram.ui.Components.s60(this.f40199a, gpVar.f33618l0, gpVar.Y, gpVar.f33621o0, gpVar, gpVar.Z, true, ChatObject.isChannel(gpVar.X));
        gp gpVar2 = this.f40200b;
        gpVar2.f33622p0 = s60Var;
        gpVar2.f33622p0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
