package org.telegram.ui;

import android.content.Context;
public final class u91 extends g91 {
    public final int v;
    public final int f44072w;
    public int f44073x;
    public qh f44074y;

    public u91(Context context, int i10, int i11, kg.g gVar, int i12) {
        super(context, i11, gVar, null);
        this.v = i10;
        this.f44072w = i12;
    }

    @Override
    public final void b(i91 i91Var) {
        int i10;
        if (i91Var != null && (i10 = this.f44073x) >= 0) {
            i91Var.a(this.v, this.f44072w, i10, this.f44074y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
