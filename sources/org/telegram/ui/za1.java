package org.telegram.ui;

import android.content.Context;
public final class za1 extends la1 {
    public final int v;
    public final int f43357w;
    public int f43358x;
    public org.telegram.ui.Components.r51 f43359y;

    public za1(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f43357w = i12;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        if (na1Var != null && (i10 = this.f43358x) >= 0) {
            na1Var.a(this.v, this.f43357w, i10, this.f43359y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
