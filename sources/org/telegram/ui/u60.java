package org.telegram.ui;

import android.content.Context;
public final class u60 extends org.telegram.ui.Components.w20 {
    public final c70 f42340r;

    public u60(c70 c70Var, Context context, int i10) {
        super(context, i10);
        this.f42340r = c70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.d40 d40Var) {
        super.a(d40Var);
        c70.Z(this.f42340r);
    }

    @Override
    public final void b() {
        super.b();
        c70.Z(this.f42340r);
    }

    @Override
    public final void c(org.telegram.ui.Components.d40 d40Var) {
        c70 c70Var = this.f42340r;
        if (d40Var == c70Var.X) {
            c70Var.X = null;
        }
        if (d40Var == c70Var.Y) {
            c70Var.Y = null;
        }
        super.c(d40Var);
        c70.Z(c70Var);
    }
}
