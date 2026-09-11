package org.telegram.ui;

import android.content.Context;
public final class wh0 implements org.telegram.ui.Components.v80 {
    public final org.telegram.ui.Components.w80 f42394a;
    public final xh0 f42395b;

    public wh0(xh0 xh0Var, org.telegram.ui.Components.w80 w80Var) {
        this.f42395b = xh0Var;
        this.f42394a = w80Var;
    }

    @Override
    public final void c() {
        yh0.W(this.f42395b.d);
    }

    @Override
    public final void d() {
        xh0 xh0Var = this.f42395b;
        yh0 yh0Var = xh0Var.d;
        Context context = this.f42394a.getContext();
        yh0 yh0Var2 = xh0Var.d;
        yh0Var.f43135l0 = new org.telegram.ui.Components.r60(context, yh0Var2.f43126e, yh0Var2.d, yh0Var2.f43134k0, yh0Var2, yh0Var2.f43136n, true, yh0Var2.h);
        xh0Var.d.f43135l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void j() {
    }
}
