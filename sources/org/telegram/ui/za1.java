package org.telegram.ui;

import android.content.Context;
public final class za1 extends la1 {
    public final int v;
    public final int f40174w;
    public int f40175x;
    public org.telegram.ui.Components.i61 f40176y;

    public za1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f40174w = i12;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        if (na1Var != null && (i10 = this.f40175x) >= 0) {
            na1Var.a(this.v, this.f40174w, i10, this.f40176y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
