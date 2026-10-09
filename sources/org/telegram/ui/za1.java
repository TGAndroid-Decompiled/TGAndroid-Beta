package org.telegram.ui;

import android.content.Context;
public final class za1 extends la1 {
    public final int v;
    public final int f44527w;
    public int f44528x;
    public xh f44529y;

    public za1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f44527w = i12;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        if (na1Var != null && (i10 = this.f44528x) >= 0) {
            na1Var.a(this.v, this.f44527w, i10, this.f44529y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
