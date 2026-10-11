package org.telegram.ui;

import android.content.Context;
public final class ya1 extends ka1 {
    public final int v;
    public final int f44297w;
    public int f44298x;
    public xh f44299y;

    public ya1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f44297w = i12;
    }

    @Override
    public final void b(ma1 ma1Var) {
        int i10;
        if (ma1Var != null && (i10 = this.f44298x) >= 0) {
            ma1Var.a(this.v, this.f44297w, i10, this.f44299y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
