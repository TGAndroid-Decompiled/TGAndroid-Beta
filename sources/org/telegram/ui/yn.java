package org.telegram.ui;

import android.content.Context;
public final class yn implements org.telegram.ui.Components.p70 {
    public final Context f52271a;
    public final go f52272b;

    public yn(go goVar, Context context) {
        this.f52272b = goVar;
        this.f52271a = context;
    }

    @Override
    public final void e() {
        this.f52272b.d0(true);
    }

    @Override
    public final void f() {
        go goVar = this.f52272b;
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(this.f52271a, goVar.f46063l0, goVar.Y, goVar.f46066o0, goVar, goVar.Z, true, org.telegram.messenger.t3.T(goVar.X));
        go goVar2 = this.f52272b;
        goVar2.f46067p0 = m50Var;
        goVar2.f46067p0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
