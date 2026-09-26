package org.telegram.ui;

import android.content.Context;
public final class r60 extends org.telegram.ui.Components.h20 {
    public final z60 f37188r;

    public r60(z60 z60Var, Context context, int i10) {
        super(context, i10);
        this.f37188r = z60Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.o30 o30Var) {
        super.a(o30Var);
        z60.Z(this.f37188r);
    }

    @Override
    public final void b() {
        super.b();
        z60.Z(this.f37188r);
    }

    @Override
    public final void c(org.telegram.ui.Components.o30 o30Var) {
        z60 z60Var = this.f37188r;
        if (o30Var == z60Var.X) {
            z60Var.X = null;
        }
        if (o30Var == z60Var.Y) {
            z60Var.Y = null;
        }
        super.c(o30Var);
        z60.Z(z60Var);
    }
}
