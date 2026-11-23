package org.telegram.ui;

import android.content.Context;
public final class r40 extends org.telegram.ui.Components.j10 {
    public final z40 f51475r;

    public r40(z40 z40Var, Context context, int i7) {
        super(context, i7);
        this.f51475r = z40Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.p20 p20Var) {
        super.a(p20Var);
        z40.e0(this.f51475r);
    }

    @Override
    public final void b() {
        super.b();
        z40.e0(this.f51475r);
    }

    @Override
    public final void c(org.telegram.ui.Components.p20 p20Var) {
        z40 z40Var = this.f51475r;
        if (p20Var == z40Var.Y) {
            z40Var.Y = null;
        }
        if (p20Var == z40Var.Z) {
            z40Var.Z = null;
        }
        super.c(p20Var);
        z40.e0(z40Var);
    }
}
