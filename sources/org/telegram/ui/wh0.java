package org.telegram.ui;

import android.content.Context;
public final class wh0 implements org.telegram.ui.Components.x90 {
    public final org.telegram.ui.Components.y90 f43775a;
    public final xh0 f43776b;

    public wh0(xh0 xh0Var, org.telegram.ui.Components.y90 y90Var) {
        this.f43776b = xh0Var;
        this.f43775a = y90Var;
    }

    @Override
    public final void c() {
        yh0.W(this.f43776b.d);
    }

    @Override
    public final void i() {
        xh0 xh0Var = this.f43776b;
        yh0 yh0Var = xh0Var.d;
        Context context = this.f43775a.getContext();
        yh0 yh0Var2 = xh0Var.d;
        yh0Var.f44419l0 = new org.telegram.ui.Components.u70(context, yh0Var2.f44410e, yh0Var2.d, yh0Var2.f44418k0, yh0Var2, yh0Var2.f44420n, true, yh0Var2.h);
        xh0Var.d.f44419l0.show();
    }

    @Override
    public final void a() {
    }

    @Override
    public final void j() {
    }
}
