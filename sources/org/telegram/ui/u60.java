package org.telegram.ui;

import android.content.Context;
public final class u60 extends org.telegram.ui.Components.x20 {
    public final c70 f42368r;

    public u60(c70 c70Var, Context context, int i10) {
        super(context, i10);
        this.f42368r = c70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.e40 e40Var) {
        super.a(e40Var);
        c70.Z(this.f42368r);
    }

    @Override
    public final void b() {
        super.b();
        c70.Z(this.f42368r);
    }

    @Override
    public final void c(org.telegram.ui.Components.e40 e40Var) {
        c70 c70Var = this.f42368r;
        if (e40Var == c70Var.X) {
            c70Var.X = null;
        }
        if (e40Var == c70Var.Y) {
            c70Var.Y = null;
        }
        super.c(e40Var);
        c70.Z(c70Var);
    }
}
