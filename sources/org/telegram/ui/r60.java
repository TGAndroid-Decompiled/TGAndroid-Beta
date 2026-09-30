package org.telegram.ui;

import android.content.Context;
public final class r60 extends org.telegram.ui.Components.j20 {
    public final z60 f37291r;

    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.f37291r = z60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.q30 q30Var) {
        super.a(q30Var);
        z60.Z(this.f37291r);
    }

    @Override
    public final void b() {
        super.b();
        z60.Z(this.f37291r);
    }

    @Override
    public final void c(org.telegram.ui.Components.q30 q30Var) {
        z60 z60Var = this.f37291r;
        if (q30Var == z60Var.X) {
            z60Var.X = null;
        }
        if (q30Var == z60Var.Y) {
            z60Var.Y = null;
        }
        super.c(q30Var);
        z60.Z(z60Var);
    }
}
