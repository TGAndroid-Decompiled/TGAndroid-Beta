package org.telegram.ui;

import android.content.Context;
public final class z41 extends l41 {
    public fh E;
    public final int f54523w;
    public final int f54524x;
    public int f54525y;

    public z41(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f54523w = i7;
        this.f54524x = i11;
    }

    @Override
    public final void b(n41 n41Var) {
        int i7;
        if (n41Var != null && (i7 = this.f54525y) >= 0) {
            n41Var.a(this.f54523w, this.f54524x, i7, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
