package org.telegram.ui;

import android.content.Context;
public final class xh0 implements org.telegram.ui.Components.x90 {
    public final org.telegram.ui.Components.y90 f44081a;
    public final yh0 f44082b;

    public xh0(yh0 yh0Var, org.telegram.ui.Components.y90 y90Var) {
        this.f44082b = yh0Var;
        this.f44081a = y90Var;
    }

    @Override
    public final void c() {
        zh0.W(this.f44082b.d);
    }

    @Override
    public final void i() {
        yh0 yh0Var = this.f44082b;
        zh0 zh0Var = yh0Var.d;
        Context context = this.f44081a.getContext();
        zh0 zh0Var2 = yh0Var.d;
        zh0Var.f44693l0 = new org.telegram.ui.Components.u70(context, zh0Var2.f44684e, zh0Var2.d, zh0Var2.f44692k0, zh0Var2, zh0Var2.f44694n, true, zh0Var2.h);
        yh0Var.d.f44693l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
