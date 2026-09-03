package org.telegram.ui;

import android.content.Context;
public final class r60 extends org.telegram.ui.Components.h20 {
    public final z60 f40757r;

    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.f40757r = z60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.p30 p30Var) {
        super.a(p30Var);
        z60.Z(this.f40757r);
    }

    @Override
    public final void b() {
        super.b();
        z60.Z(this.f40757r);
    }

    @Override
    public final void c(org.telegram.ui.Components.p30 p30Var) {
        z60 z60Var = this.f40757r;
        if (p30Var == z60Var.U) {
            z60Var.U = null;
        }
        if (p30Var == z60Var.V) {
            z60Var.V = null;
        }
        super.c(p30Var);
        z60.Z(z60Var);
    }
}
