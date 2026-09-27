package org.telegram.ui;

import android.content.Context;
public final class th0 implements org.telegram.ui.Components.h90 {
    public final org.telegram.ui.Components.i90 f37822a;
    public final uh0 f37823b;

    public th0(uh0 uh0Var, org.telegram.ui.Components.i90 i90Var) {
        this.f37823b = uh0Var;
        this.f37822a = i90Var;
    }

    @Override
    public final void e() {
        vh0.W(this.f37823b.d);
    }

    @Override
    public final void i() {
        uh0 uh0Var = this.f37823b;
        vh0 vh0Var = uh0Var.d;
        Context context = this.f37822a.getContext();
        vh0 vh0Var2 = uh0Var.d;
        vh0Var.f38597l0 = new org.telegram.ui.Components.e70(context, vh0Var2.e, vh0Var2.d, vh0Var2.f38596k0, vh0Var2, vh0Var2.f38598n, true, vh0Var2.h);
        uh0Var.d.f38597l0.show();
    }

    @Override
    public final void c() {
    }

    @Override
    public final void j() {
    }
}
