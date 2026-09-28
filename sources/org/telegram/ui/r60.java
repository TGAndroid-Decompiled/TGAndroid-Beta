package org.telegram.ui;

import android.content.Context;
public final class r60 extends org.telegram.ui.Components.i20 {
    public final z60 f37189r;

    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.f37189r = z60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.p30 p30Var) {
        super.a(p30Var);
        z60.Z(this.f37189r);
    }

    @Override
    public final void b() {
        super.b();
        z60.Z(this.f37189r);
    }

    @Override
    public final void c(org.telegram.ui.Components.p30 p30Var) {
        z60 z60Var = this.f37189r;
        if (p30Var == z60Var.X) {
            z60Var.X = null;
        }
        if (p30Var == z60Var.Y) {
            z60Var.Y = null;
        }
        super.c(p30Var);
        z60.Z(z60Var);
    }
}
