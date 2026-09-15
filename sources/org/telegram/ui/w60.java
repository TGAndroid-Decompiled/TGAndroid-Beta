package org.telegram.ui;

import android.content.Context;
public final class w60 extends org.telegram.ui.Components.f20 {
    public final e70 f38782r;

    public w60(e70 e70Var, Context context, int i10) {
        super(context, i10);
        this.f38782r = e70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.m30 m30Var) {
        super.a(m30Var);
        e70.Z(this.f38782r);
    }

    @Override
    public final void b() {
        super.b();
        e70.Z(this.f38782r);
    }

    @Override
    public final void c(org.telegram.ui.Components.m30 m30Var) {
        e70 e70Var = this.f38782r;
        if (m30Var == e70Var.X) {
            e70Var.X = null;
        }
        if (m30Var == e70Var.Y) {
            e70Var.Y = null;
        }
        super.c(m30Var);
        e70.Z(e70Var);
    }
}
