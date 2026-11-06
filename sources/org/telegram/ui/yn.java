package org.telegram.ui;

import android.content.Context;
public final class yn implements org.telegram.ui.Components.p70 {
    public final Context f52293a;
    public final go f52294b;

    public yn(go goVar, Context context) {
        this.f52294b = goVar;
        this.f52293a = context;
    }

    @Override
    public final void e() {
        this.f52294b.d0(true);
    }

    @Override
    public final void f() {
        go goVar = this.f52294b;
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(this.f52293a, goVar.f46062l0, goVar.Y, goVar.f46065o0, goVar, goVar.Z, true, org.telegram.messenger.t3.T(goVar.X));
        go goVar2 = this.f52294b;
        goVar2.f46066p0 = m50Var;
        goVar2.f46066p0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
