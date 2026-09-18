package org.telegram.ui;

import android.content.Context;
public final class yh0 implements org.telegram.ui.Components.u80 {
    public final org.telegram.ui.Components.v80 f39921a;
    public final zh0 f39922b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.v80 v80Var) {
        this.f39922b = zh0Var;
        this.f39921a = v80Var;
    }

    @Override
    public final void c() {
        ai0.W(this.f39922b.d);
    }

    @Override
    public final void i() {
        zh0 zh0Var = this.f39922b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.f39921a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.f31888l0 = new org.telegram.ui.Components.r60(context, ai0Var2.e, ai0Var2.d, ai0Var2.f31887k0, ai0Var2, ai0Var2.f31889n, true, ai0Var2.h);
        zh0Var.d.f31888l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
