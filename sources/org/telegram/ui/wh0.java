package org.telegram.ui;

import android.content.Context;
public final class wh0 implements org.telegram.ui.Components.u80 {
    public final org.telegram.ui.Components.v80 f39230a;
    public final xh0 f39231b;

    public wh0(xh0 xh0Var, org.telegram.ui.Components.v80 v80Var) {
        this.f39231b = xh0Var;
        this.f39230a = v80Var;
    }

    @Override
    public final void c() {
        yh0.W(this.f39231b.d);
    }

    @Override
    public final void i() {
        xh0 xh0Var = this.f39231b;
        yh0 yh0Var = xh0Var.d;
        Context context = this.f39230a.getContext();
        yh0 yh0Var2 = xh0Var.d;
        yh0Var.f39867l0 = new org.telegram.ui.Components.r60(context, yh0Var2.e, yh0Var2.d, yh0Var2.f39866k0, yh0Var2, yh0Var2.f39868n, true, yh0Var2.h);
        xh0Var.d.f39867l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
