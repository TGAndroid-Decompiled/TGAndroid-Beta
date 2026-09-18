package org.telegram.ui;

import android.content.Context;
public final class xh0 implements org.telegram.ui.Components.d90 {
    public final org.telegram.ui.Components.e90 f39496a;
    public final yh0 f39497b;

    public xh0(yh0 yh0Var, org.telegram.ui.Components.e90 e90Var) {
        this.f39497b = yh0Var;
        this.f39496a = e90Var;
    }

    @Override
    public final void e() {
        zh0.W(this.f39497b.d);
    }

    @Override
    public final void j() {
        yh0 yh0Var = this.f39497b;
        zh0 zh0Var = yh0Var.d;
        Context context = this.f39496a.getContext();
        zh0 zh0Var2 = yh0Var.d;
        zh0Var.f40161l0 = new org.telegram.ui.Components.a70(context, zh0Var2.e, zh0Var2.d, zh0Var2.f40160k0, zh0Var2, zh0Var2.f40162n, true, zh0Var2.h);
        yh0Var.d.f40161l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void k() {
    }
}
