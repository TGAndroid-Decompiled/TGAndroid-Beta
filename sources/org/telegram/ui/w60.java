package org.telegram.ui;

import android.content.Context;
public final class w60 extends org.telegram.ui.Components.z20 {
    public final e70 f43053r;

    public w60(e70 e70Var, Context context, int i10) {
        super(context, i10);
        this.f43053r = e70Var;
    }

    @Override
    public final void a(org.telegram.ui.Components.g40 g40Var) {
        super.a(g40Var);
        e70.Z(this.f43053r);
    }

    @Override
    public final void b() {
        super.b();
        e70.Z(this.f43053r);
    }

    @Override
    public final void c(org.telegram.ui.Components.g40 g40Var) {
        e70 e70Var = this.f43053r;
        if (g40Var == e70Var.X) {
            e70Var.X = null;
        }
        if (g40Var == e70Var.Y) {
            e70Var.Y = null;
        }
        super.c(g40Var);
        e70.Z(e70Var);
    }
}
