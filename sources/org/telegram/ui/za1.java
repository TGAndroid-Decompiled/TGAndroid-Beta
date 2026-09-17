package org.telegram.ui;

import android.content.Context;
public final class za1 extends la1 {
    public final int v;
    public final int f43358w;
    public int f43359x;
    public org.telegram.ui.Components.r51 f43360y;

    public za1(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f43358w = i12;
    }

    @Override
    public final void b(na1 na1Var) {
        int i10;
        if (na1Var != null && (i10 = this.f43359x) >= 0) {
            na1Var.a(this.v, this.f43358w, i10, this.f43360y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
