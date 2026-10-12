package org.telegram.ui;

import android.content.Context;
public final class yh0 implements org.telegram.ui.Components.aa0 {
    public final org.telegram.ui.Components.ba0 f44487a;
    public final zh0 f44488b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.ba0 ba0Var) {
        this.f44488b = zh0Var;
        this.f44487a = ba0Var;
    }

    @Override
    public final void c() {
        ai0.W(this.f44488b.d);
    }

    @Override
    public final void i() {
        zh0 zh0Var = this.f44488b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.f44487a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.f35831l0 = new org.telegram.ui.Components.w70(context, ai0Var2.f35822e, ai0Var2.d, ai0Var2.f35830k0, ai0Var2, ai0Var2.f35832n, true, ai0Var2.h);
        zh0Var.d.f35831l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
