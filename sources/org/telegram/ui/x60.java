package org.telegram.ui;

import android.content.Context;
public final class x60 extends org.telegram.ui.Components.f20 {
    public final f70 f42625r;

    public x60(f70 f70Var, Context context, int i10) {
        super(context, i10);
        this.f42625r = f70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.m30 m30Var) {
        super.a(m30Var);
        f70.Z(this.f42625r);
    }

    @Override
    public final void b() {
        super.b();
        f70.Z(this.f42625r);
    }

    @Override
    public final void c(org.telegram.ui.Components.m30 m30Var) {
        f70 f70Var = this.f42625r;
        if (m30Var == f70Var.X) {
            f70Var.X = null;
        }
        if (m30Var == f70Var.Y) {
            f70Var.Y = null;
        }
        super.c(m30Var);
        f70.Z(f70Var);
    }
}
