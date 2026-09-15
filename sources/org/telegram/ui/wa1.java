package org.telegram.ui;

import android.content.Context;
public final class wa1 extends ia1 {
    public final int v;
    public final int f38831w;
    public int f38832x;
    public org.telegram.ui.Components.s51 f38833y;

    public wa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f38831w = i12;
    }

    @Override
    public final void b(ka1 ka1Var) {
        int i10;
        if (ka1Var != null && (i10 = this.f38832x) >= 0) {
            ka1Var.a(this.v, this.f38831w, i10, this.f38833y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
