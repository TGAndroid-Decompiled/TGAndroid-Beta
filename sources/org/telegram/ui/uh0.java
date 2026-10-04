package org.telegram.ui;

import android.content.Context;
public final class uh0 implements org.telegram.ui.Components.i90 {
    public final org.telegram.ui.Components.j90 f41235a;
    public final vh0 f41236b;

    public uh0(vh0 vh0Var, org.telegram.ui.Components.j90 j90Var) {
        this.f41236b = vh0Var;
        this.f41235a = j90Var;
    }

    @Override
    public final void c() {
        wh0.U(this.f41236b.d);
    }

    @Override
    public final void h() {
        vh0 vh0Var = this.f41236b;
        wh0 wh0Var = vh0Var.d;
        Context context = this.f41235a.getContext();
        wh0 wh0Var2 = vh0Var.d;
        wh0Var.f42490l0 = new org.telegram.ui.Components.f70(context, wh0Var2.f42481e, wh0Var2.d, wh0Var2.f42489k0, wh0Var2, wh0Var2.f42491n, true, wh0Var2.h);
        vh0Var.d.f42490l0.show();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void i() {
    }
}
