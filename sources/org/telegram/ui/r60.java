package org.telegram.ui;

import android.content.Context;
public final class r60 extends org.telegram.ui.Components.g20 {
    public final z60 f37190r;

    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.f37190r = z60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.n30 n30Var) {
        super.a(n30Var);
        z60.Z(this.f37190r);
    }

    @Override
    public final void b() {
        super.b();
        z60.Z(this.f37190r);
    }

    @Override
    public final void c(org.telegram.ui.Components.n30 n30Var) {
        z60 z60Var = this.f37190r;
        if (n30Var == z60Var.X) {
            z60Var.X = null;
        }
        if (n30Var == z60Var.Y) {
            z60Var.Y = null;
        }
        super.c(n30Var);
        z60.Z(z60Var);
    }
}
