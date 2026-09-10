package org.telegram.ui;

import android.content.Context;
public final class xh0 implements org.telegram.ui.Components.e90 {
    public final org.telegram.ui.Components.f90 f38751a;
    public final yh0 f38752b;

    public xh0(yh0 yh0Var, org.telegram.ui.Components.f90 f90Var) {
        this.f38752b = yh0Var;
        this.f38751a = f90Var;
    }

    @Override
    public final void e() {
        zh0.W(this.f38752b.d);
    }

    @Override
    public final void i() {
        yh0 yh0Var = this.f38752b;
        zh0 zh0Var = yh0Var.d;
        Context context = this.f38751a.getContext();
        zh0 zh0Var2 = yh0Var.d;
        zh0Var.f39337l0 = new org.telegram.ui.Components.a70(context, zh0Var2.e, zh0Var2.d, zh0Var2.f39336k0, zh0Var2, zh0Var2.f39338n, true, zh0Var2.h);
        yh0Var.d.f39337l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void j() {
    }
}
