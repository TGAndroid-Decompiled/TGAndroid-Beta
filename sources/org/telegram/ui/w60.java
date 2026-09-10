package org.telegram.ui;

import android.content.Context;
public final class w60 extends org.telegram.ui.Components.o20 {
    public final e70 f37732r;

    public w60(e70 e70Var, Context context, int i10) {
        super(context, i10);
        this.f37732r = e70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.w30 w30Var) {
        super.a(w30Var);
        e70.Z(this.f37732r);
    }

    @Override
    public final void b() {
        super.b();
        e70.Z(this.f37732r);
    }

    @Override
    public final void c(org.telegram.ui.Components.w30 w30Var) {
        e70 e70Var = this.f37732r;
        if (w30Var == e70Var.X) {
            e70Var.X = null;
        }
        if (w30Var == e70Var.Y) {
            e70Var.Y = null;
        }
        super.c(w30Var);
        e70.Z(e70Var);
    }
}
