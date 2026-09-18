package org.telegram.ui;

import android.content.Context;
public final class xa1 extends ja1 {
    public final int v;
    public final int f39421w;
    public int f39422x;
    public org.telegram.ui.Components.h61 f39423y;

    public xa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f39421w = i12;
    }

    @Override
    public final void b(la1 la1Var) {
        int i10;
        if (la1Var != null && (i10 = this.f39422x) >= 0) {
            la1Var.a(this.v, this.f39421w, i10, this.f39423y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
