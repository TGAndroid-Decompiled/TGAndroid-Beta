package org.telegram.ui;

import android.content.Context;
public final class x41 extends j41 {
    public eh E;
    public final int f53094w;
    public final int f53095x;
    public int f53096y;

    public x41(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f53094w = i7;
        this.f53095x = i11;
    }

    @Override
    public final void b(l41 l41Var) {
        int i7;
        if (l41Var != null && (i7 = this.f53096y) >= 0) {
            l41Var.a(this.f53094w, this.f53095x, i7, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
