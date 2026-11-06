package org.telegram.ui;

import android.content.Context;
public final class yn implements org.telegram.ui.Components.p70 {
    public final Context f52272a;
    public final go f52273b;

    public yn(go goVar, Context context) {
        this.f52273b = goVar;
        this.f52272a = context;
    }

    @Override
    public final void e() {
        this.f52273b.d0(true);
    }

    @Override
    public final void f() {
        go goVar = this.f52273b;
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(this.f52272a, goVar.f46035l0, goVar.Y, goVar.f46038o0, goVar, goVar.Z, true, org.telegram.messenger.t3.T(goVar.X));
        go goVar2 = this.f52273b;
        goVar2.f46039p0 = m50Var;
        goVar2.f46039p0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void k() {
    }
}
