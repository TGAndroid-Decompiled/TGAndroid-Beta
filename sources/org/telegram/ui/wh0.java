package org.telegram.ui;

import android.content.Context;
public final class wh0 implements org.telegram.ui.Components.v80 {
    public final org.telegram.ui.Components.w80 f42395a;
    public final xh0 f42396b;

    public wh0(xh0 xh0Var, org.telegram.ui.Components.w80 w80Var) {
        this.f42396b = xh0Var;
        this.f42395a = w80Var;
    }

    @Override
    public final void c() {
        yh0.W(this.f42396b.d);
    }

    @Override
    public final void d() {
        xh0 xh0Var = this.f42396b;
        yh0 yh0Var = xh0Var.d;
        Context context = this.f42395a.getContext();
        yh0 yh0Var2 = xh0Var.d;
        yh0Var.f43136l0 = new org.telegram.ui.Components.r60(context, yh0Var2.f43127e, yh0Var2.d, yh0Var2.f43135k0, yh0Var2, yh0Var2.f43137n, true, yh0Var2.h);
        xh0Var.d.f43136l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void j() {
    }
}
