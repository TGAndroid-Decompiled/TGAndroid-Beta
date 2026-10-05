package org.telegram.ui;

import android.content.Context;
public final class uh0 implements org.telegram.ui.Components.i90 {
    public final org.telegram.ui.Components.j90 f41272a;
    public final vh0 f41273b;

    public uh0(vh0 vh0Var, org.telegram.ui.Components.j90 j90Var) {
        this.f41273b = vh0Var;
        this.f41272a = j90Var;
    }

    @Override
    public final void c() {
        wh0.U(this.f41273b.d);
    }

    @Override
    public final void h() {
        vh0 vh0Var = this.f41273b;
        wh0 wh0Var = vh0Var.d;
        Context context = this.f41272a.getContext();
        wh0 wh0Var2 = vh0Var.d;
        wh0Var.f42545l0 = new org.telegram.ui.Components.f70(context, wh0Var2.f42536e, wh0Var2.d, wh0Var2.f42544k0, wh0Var2, wh0Var2.f42546n, true, wh0Var2.h);
        vh0Var.d.f42545l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
