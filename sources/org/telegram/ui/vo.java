package org.telegram.ui;

import android.content.Context;
public final class vo implements org.telegram.ui.Components.i80 {
    public final Context f42571a;
    public final cp f42572b;

    public vo(cp cpVar, Context context) {
        this.f42572b = cpVar;
        this.f42571a = context;
    }

    @Override
    public final void d() {
        this.f42572b.d0(true);
    }

    @Override
    public final void g() {
        cp cpVar = this.f42572b;
        org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(this.f42571a, cpVar.f36372l0, cpVar.Y, cpVar.f36375o0, cpVar, cpVar.Z, true, org.telegram.messenger.w3.T(cpVar.X));
        cp cpVar2 = this.f42572b;
        cpVar2.f36376p0 = c60Var;
        cpVar2.f36376p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void n() {
    }
}
