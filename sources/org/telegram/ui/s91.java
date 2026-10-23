package org.telegram.ui;

import android.content.Context;
public final class s91 extends e91 {
    public final int v;
    public final int f41328w;
    public int f41329x;
    public oh f41330y;

    public s91(Context context, int i10, int i11, jg.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f41328w = i12;
    }

    @Override
    public final void b(g91 g91Var) {
        int i10;
        if (g91Var != null && (i10 = this.f41329x) >= 0) {
            g91Var.a(this.v, this.f41328w, i10, this.f41330y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
