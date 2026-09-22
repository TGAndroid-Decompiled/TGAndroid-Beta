package org.telegram.ui;

import android.content.Context;
public final class yh0 implements org.telegram.ui.Components.f90 {
    public final org.telegram.ui.Components.g90 f39961a;
    public final zh0 f39962b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.g90 g90Var) {
        this.f39962b = zh0Var;
        this.f39961a = g90Var;
    }

    @Override
    public final void c() {
        ai0.W(this.f39962b.d);
    }

    @Override
    public final void h() {
        zh0 zh0Var = this.f39962b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.f39961a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.f32107l0 = new org.telegram.ui.Components.c70(context, ai0Var2.e, ai0Var2.d, ai0Var2.f32106k0, ai0Var2, ai0Var2.f32108n, true, ai0Var2.h);
        zh0Var.d.f32107l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void i() {
    }
}
