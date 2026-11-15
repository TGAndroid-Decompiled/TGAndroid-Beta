package org.telegram.ui;

import android.content.Context;
public final class zn implements org.telegram.ui.Components.s70 {
    public final Context f53990a;
    public final ho f53991b;

    public zn(ho hoVar, Context context) {
        this.f53991b = hoVar;
        this.f53990a = context;
    }

    @Override
    public final void e() {
        this.f53991b.d0(true);
    }

    @Override
    public final void f() {
        ho hoVar = this.f53991b;
        org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(this.f53990a, hoVar.m0, hoVar.Z, hoVar.f47768p0, hoVar, hoVar.f47749a0, true, org.telegram.messenger.t3.T(hoVar.Y));
        ho hoVar2 = this.f53991b;
        hoVar2.f47769q0 = p50Var;
        hoVar2.f47769q0.show();
    }

    @Override
    public final void d() {
    }

    @Override
    public final void j() {
    }
}
