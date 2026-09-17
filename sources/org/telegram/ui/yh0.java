package org.telegram.ui;

import android.content.Context;
public final class yh0 implements org.telegram.ui.Components.u80 {
    public final org.telegram.ui.Components.v80 f39916a;
    public final zh0 f39917b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.v80 v80Var) {
        this.f39917b = zh0Var;
        this.f39916a = v80Var;
    }

    @Override
    public final void c() {
        ai0.W(this.f39917b.d);
    }

    @Override
    public final void i() {
        zh0 zh0Var = this.f39917b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.f39916a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.f31884l0 = new org.telegram.ui.Components.r60(context, ai0Var2.e, ai0Var2.d, ai0Var2.f31883k0, ai0Var2, ai0Var2.f31885n, true, ai0Var2.h);
        zh0Var.d.f31884l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
