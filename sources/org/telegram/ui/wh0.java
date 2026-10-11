package org.telegram.ui;

import android.content.Context;
public final class wh0 implements org.telegram.ui.Components.w90 {
    public final org.telegram.ui.Components.x90 f43809a;
    public final xh0 f43810b;

    public wh0(xh0 xh0Var, org.telegram.ui.Components.x90 x90Var) {
        this.f43810b = xh0Var;
        this.f43809a = x90Var;
    }

    @Override
    public final void c() {
        yh0.W(this.f43810b.d);
    }

    @Override
    public final void i() {
        xh0 xh0Var = this.f43810b;
        yh0 yh0Var = xh0Var.d;
        Context context = this.f43809a.getContext();
        yh0 yh0Var2 = xh0Var.d;
        yh0Var.f44453l0 = new org.telegram.ui.Components.t70(context, yh0Var2.f44444e, yh0Var2.d, yh0Var2.f44452k0, yh0Var2, yh0Var2.f44454n, true, yh0Var2.h);
        xh0Var.d.f44453l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
