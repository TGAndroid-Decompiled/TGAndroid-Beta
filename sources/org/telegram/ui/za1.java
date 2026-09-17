package org.telegram.ui;

import android.content.Context;
public final class za1 extends la1 {
    public final int v;
    public final int f43385w;
    public int f43386x;
    public org.telegram.ui.Components.r51 f43387y;

    public za1(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f43385w = i12;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        if (na1Var != null && (i10 = this.f43386x) >= 0) {
            na1Var.a(this.v, this.f43385w, i10, this.f43387y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
