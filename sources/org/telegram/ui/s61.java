package org.telegram.ui;

import android.content.Context;
public final class s61 extends e61 {
    public uh D;
    public final int f41393w;
    public final int f41394x;
    public int f41395y;

    public s61(Context context, int i10, int i11, bg.h hVar, int i12) {
        super(context, i11, hVar, null);
        this.f41393w = i10;
        this.f41394x = i12;
    }

    @Override
    public final void b(g61 g61Var) {
        int i10;
        if (g61Var != null && (i10 = this.f41395y) >= 0) {
            g61Var.a(this.f41393w, this.f41394x, i10, this.D);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
