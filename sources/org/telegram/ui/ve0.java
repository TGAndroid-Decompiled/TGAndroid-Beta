package org.telegram.ui;

import android.content.Context;
public final class ve0 implements org.telegram.ui.Components.l70 {
    public final org.telegram.ui.Components.m70 f50468a;
    public final we0 f50469b;

    public ve0(we0 we0Var, org.telegram.ui.Components.m70 m70Var) {
        this.f50469b = we0Var;
        this.f50468a = m70Var;
    }

    @Override
    public final void d() {
        xe0.b0(this.f50469b.d);
    }

    @Override
    public final void h() {
        we0 we0Var = this.f50469b;
        xe0 xe0Var = we0Var.d;
        Context context = this.f50468a.getContext();
        xe0 xe0Var2 = we0Var.d;
        xe0Var.m0 = new org.telegram.ui.Components.i50(context, xe0Var2.f51990e, xe0Var2.d, xe0Var2.f51999l0, xe0Var2, xe0Var2.f52000n, true, xe0Var2.h);
        we0Var.d.m0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
