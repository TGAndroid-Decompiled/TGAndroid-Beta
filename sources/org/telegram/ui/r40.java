package org.telegram.ui;

import android.content.Context;
public final class r40 extends org.telegram.ui.Components.v00 {
    public final z40 f49226r;

    public r40(z40 z40Var, Context context, int i7) {
        super(context, i7);
        this.f49226r = z40Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.c20 c20Var) {
        super.a(c20Var);
        z40.e0(this.f49226r);
    }

    @Override
    public final void b() {
        super.b();
        z40.e0(this.f49226r);
    }

    @Override
    public final void c(org.telegram.ui.Components.c20 c20Var) {
        z40 z40Var = this.f49226r;
        if (c20Var == z40Var.X) {
            z40Var.X = null;
        }
        if (c20Var == z40Var.Y) {
            z40Var.Y = null;
        }
        super.c(c20Var);
        z40.e0(z40Var);
    }
}
