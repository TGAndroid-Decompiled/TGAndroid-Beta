package org.telegram.ui;

import android.content.Context;
public final class yh0 implements org.telegram.ui.Components.c90 {
    public final org.telegram.ui.Components.d90 f39941a;
    public final zh0 f39942b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.d90 d90Var) {
        this.f39942b = zh0Var;
        this.f39941a = d90Var;
    }

    @Override
    public final void e() {
        ai0.W(this.f39942b.d);
    }

    @Override
    public final void h() {
        zh0 zh0Var = this.f39942b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.f39941a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.f32086l0 = new org.telegram.ui.Components.z60(context, ai0Var2.e, ai0Var2.d, ai0Var2.f32085k0, ai0Var2, ai0Var2.f32087n, true, ai0Var2.h);
        zh0Var.d.f32086l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i() {
    }
}
