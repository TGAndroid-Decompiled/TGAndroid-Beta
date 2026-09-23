package org.telegram.ui;

import android.content.Context;
public final class t60 extends org.telegram.ui.Components.g20 {
    public final b70 f37539r;

    public t60(b70 b70Var, Context context, int i10) {
        super(context, i10);
        this.f37539r = b70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.n30 n30Var) {
        super.a(n30Var);
        b70.Z(this.f37539r);
    }

    @Override
    public final void b() {
        super.b();
        b70.Z(this.f37539r);
    }

    @Override
    public final void c(org.telegram.ui.Components.n30 n30Var) {
        b70 b70Var = this.f37539r;
        if (n30Var == b70Var.X) {
            b70Var.X = null;
        }
        if (n30Var == b70Var.Y) {
            b70Var.Y = null;
        }
        super.c(n30Var);
        b70.Z(b70Var);
    }
}
