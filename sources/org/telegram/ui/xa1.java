package org.telegram.ui;

import android.content.Context;
public final class xa1 extends ja1 {
    public final int v;
    public final int f39571w;
    public int f39572x;
    public org.telegram.ui.Components.s51 f39573y;

    public xa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f39571w = i12;
    }

    @Override
    public final void b(la1 la1Var) {
        int i10;
        if (la1Var != null && (i10 = this.f39572x) >= 0) {
            la1Var.a(this.v, this.f39571w, i10, this.f39573y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
