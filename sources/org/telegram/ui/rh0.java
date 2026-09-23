package org.telegram.ui;

import android.content.Context;
public final class rh0 implements org.telegram.ui.Components.v80 {
    public final org.telegram.ui.Components.w80 f36851a;
    public final sh0 f36852b;

    public rh0(sh0 sh0Var, org.telegram.ui.Components.w80 w80Var) {
        this.f36852b = sh0Var;
        this.f36851a = w80Var;
    }

    @Override
    public final void c() {
        th0.W(this.f36852b.d);
    }

    @Override
    public final void i() {
        sh0 sh0Var = this.f36852b;
        th0 th0Var = sh0Var.d;
        Context context = this.f36851a.getContext();
        th0 th0Var2 = sh0Var.d;
        th0Var.f37670l0 = new org.telegram.ui.Components.s60(context, th0Var2.e, th0Var2.d, th0Var2.f37669k0, th0Var2, th0Var2.f37671n, true, th0Var2.h);
        sh0Var.d.f37670l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
