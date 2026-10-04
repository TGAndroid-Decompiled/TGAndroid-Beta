package org.telegram.ui;

import android.content.Context;
public final class ta1 extends fa1 {
    public final int v;
    public final int f40780w;
    public int f40781x;
    public org.telegram.ui.Components.q61 f40782y;

    public ta1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f40780w = i12;
    }

    @Override
    public final void b(ha1 ha1Var) {
        int i10;
        if (ha1Var != null && (i10 = this.f40781x) >= 0) {
            ha1Var.a(this.v, this.f40780w, i10, this.f40782y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
