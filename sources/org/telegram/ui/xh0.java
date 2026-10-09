package org.telegram.ui;

import android.content.Context;
public final class xh0 implements org.telegram.ui.Components.w90 {
    public final org.telegram.ui.Components.x90 f44035a;
    public final yh0 f44036b;

    public xh0(yh0 yh0Var, org.telegram.ui.Components.x90 x90Var) {
        this.f44036b = yh0Var;
        this.f44035a = x90Var;
    }

    @Override
    public final void c() {
        zh0.W(this.f44036b.d);
    }

    @Override
    public final void i() {
        yh0 yh0Var = this.f44036b;
        zh0 zh0Var = yh0Var.d;
        Context context = this.f44035a.getContext();
        zh0 zh0Var2 = yh0Var.d;
        zh0Var.f44647l0 = new org.telegram.ui.Components.t70(context, zh0Var2.f44638e, zh0Var2.d, zh0Var2.f44646k0, zh0Var2, zh0Var2.f44648n, true, zh0Var2.h);
        yh0Var.d.f44647l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
