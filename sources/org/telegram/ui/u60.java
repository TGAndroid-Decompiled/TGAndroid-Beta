package org.telegram.ui;

import android.content.Context;
public final class u60 extends org.telegram.ui.Components.i20 {
    public final c70 f38131r;

    public u60(c70 c70Var, Context context, int i10) {
        super(context, i10);
        this.f38131r = c70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.p30 p30Var) {
        super.a(p30Var);
        c70.Z(this.f38131r);
    }

    @Override
    public final void b() {
        super.b();
        c70.Z(this.f38131r);
    }

    @Override
    public final void c(org.telegram.ui.Components.p30 p30Var) {
        c70 c70Var = this.f38131r;
        if (p30Var == c70Var.X) {
            c70Var.X = null;
        }
        if (p30Var == c70Var.Y) {
            c70Var.Y = null;
        }
        super.c(p30Var);
        c70.Z(c70Var);
    }
}
