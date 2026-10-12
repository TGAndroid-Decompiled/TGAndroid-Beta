package org.telegram.ui;

import android.content.Context;
public final class yh0 implements org.telegram.ui.Components.aa0 {
    public final org.telegram.ui.Components.ba0 f44482a;
    public final zh0 f44483b;

    public yh0(zh0 zh0Var, org.telegram.ui.Components.ba0 ba0Var) {
        this.f44483b = zh0Var;
        this.f44482a = ba0Var;
    }

    @Override
    public final void c() {
        ai0.W(this.f44483b.d);
    }

    @Override
    public final void i() {
        zh0 zh0Var = this.f44483b;
        ai0 ai0Var = zh0Var.d;
        Context context = this.f44482a.getContext();
        ai0 ai0Var2 = zh0Var.d;
        ai0Var.f35829l0 = new org.telegram.ui.Components.w70(context, ai0Var2.f35820e, ai0Var2.d, ai0Var2.f35828k0, ai0Var2, ai0Var2.f35830n, true, ai0Var2.h);
        zh0Var.d.f35829l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
