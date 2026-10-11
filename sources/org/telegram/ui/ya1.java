package org.telegram.ui;

import android.content.Context;
public final class ya1 extends ka1 {
    public final int v;
    public final int f44331w;
    public int f44332x;
    public xh f44333y;

    public ya1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f44331w = i12;
    }

    @Override
    public final void b(ma1 ma1Var) {
        int i10;
        if (ma1Var != null && (i10 = this.f44332x) >= 0) {
            ma1Var.a(this.v, this.f44331w, i10, this.f44333y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
