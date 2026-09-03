package org.telegram.ui;

import android.content.Context;
public final class s60 extends org.telegram.ui.Components.h20 {
    public final a70 f38108r;

    public s60(a70 a70Var, Context context, int i10) {
        super(context, i10);
        this.f38108r = a70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.o30 o30Var) {
        super.a(o30Var);
        a70.Z(this.f38108r);
    }

    @Override
    public final void b() {
        super.b();
        a70.Z(this.f38108r);
    }

    @Override
    public final void c(org.telegram.ui.Components.o30 o30Var) {
        a70 a70Var = this.f38108r;
        if (o30Var == a70Var.U) {
            a70Var.U = null;
        }
        if (o30Var == a70Var.V) {
            a70Var.V = null;
        }
        super.c(o30Var);
        a70.Z(a70Var);
    }
}
