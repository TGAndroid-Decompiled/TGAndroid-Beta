package org.telegram.ui;

import android.content.Context;
public final class v60 extends org.telegram.ui.Components.j20 {
    public final d70 f41566r;

    public v60(d70 d70Var, Context context, int i10) {
        super(context, i10);
        this.f41566r = d70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.q30 q30Var) {
        super.a(q30Var);
        d70.Y(this.f41566r);
    }

    @Override
    public final void b() {
        super.b();
        d70.Y(this.f41566r);
    }

    @Override
    public final void c(org.telegram.ui.Components.q30 q30Var) {
        d70 d70Var = this.f41566r;
        if (q30Var == d70Var.X) {
            d70Var.X = null;
        }
        if (q30Var == d70Var.Y) {
            d70Var.Y = null;
        }
        super.c(q30Var);
        d70.Y(d70Var);
    }
}
