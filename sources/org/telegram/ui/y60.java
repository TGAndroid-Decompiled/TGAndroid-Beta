package org.telegram.ui;

import android.content.Context;
public final class y60 extends org.telegram.ui.Components.f20 {
    public final g70 f39801r;

    public y60(g70 g70Var, Context context, int i10) {
        super(context, i10);
        this.f39801r = g70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.m30 m30Var) {
        super.a(m30Var);
        g70.Z(this.f39801r);
    }

    @Override
    public final void b() {
        super.b();
        g70.Z(this.f39801r);
    }

    @Override
    public final void c(org.telegram.ui.Components.m30 m30Var) {
        g70 g70Var = this.f39801r;
        if (m30Var == g70Var.X) {
            g70Var.X = null;
        }
        if (m30Var == g70Var.Y) {
            g70Var.Y = null;
        }
        super.c(m30Var);
        g70.Z(g70Var);
    }
}
