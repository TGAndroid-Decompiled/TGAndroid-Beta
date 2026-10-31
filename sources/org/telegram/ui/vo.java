package org.telegram.ui;

import android.content.Context;
public final class vo implements org.telegram.ui.Components.i80 {
    public final Context f42777a;
    public final cp f42778b;

    public vo(cp cpVar, Context context) {
        this.f42778b = cpVar;
        this.f42777a = context;
    }

    @Override
    public final void d() {
        this.f42778b.c0(true);
    }

    @Override
    public final void g() {
        cp cpVar = this.f42778b;
        org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(this.f42777a, cpVar.f36511l0, cpVar.Y, cpVar.f36514o0, cpVar, cpVar.Z, true, org.telegram.messenger.w3.T(cpVar.X));
        cp cpVar2 = this.f42778b;
        cpVar2.f36515p0 = c60Var;
        cpVar2.f36515p0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void n() {
    }
}
