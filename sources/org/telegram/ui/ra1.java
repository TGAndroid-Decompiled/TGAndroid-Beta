package org.telegram.ui;

import android.content.Context;
public final class ra1 extends da1 {
    public final int v;
    public final int f40053w;
    public int f40054x;
    public org.telegram.ui.Components.s61 f40055y;

    public ra1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f40053w = i12;
    }

    @Override
    public final void b(fa1 fa1Var) {
        int i10;
        if (fa1Var != null && (i10 = this.f40054x) >= 0) {
            fa1Var.a(this.v, this.f40053w, i10, this.f40055y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
