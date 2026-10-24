package org.telegram.ui;

import android.content.Context;
public final class r91 extends d91 {
    public final int v;
    public final int f41070w;
    public int f41071x;
    public oh f41072y;

    public r91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f41070w = i12;
    }

    @Override
    public final void b(f91 f91Var) {
        int i10;
        if (f91Var != null && (i10 = this.f41071x) >= 0) {
            f91Var.a(this.v, this.f41070w, i10, this.f41072y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
