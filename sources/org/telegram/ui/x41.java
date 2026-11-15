package org.telegram.ui;

import android.content.Context;
public final class x41 extends j41 {
    public eh E;
    public final int f53093w;
    public final int f53094x;
    public int f53095y;

    public x41(Context context, int i7, int i10, lg.f fVar, int i11) {
        super(context, i10, fVar, null);
        this.f53093w = i7;
        this.f53094x = i11;
    }

    @Override
    public final void b(l41 l41Var) {
        int i7;
        if (l41Var != null && (i7 = this.f53095y) >= 0) {
            l41Var.a(this.f53093w, this.f53094x, i7, this.E);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
