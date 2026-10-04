package org.telegram.ui;

import android.content.Context;
public final class ta1 extends fa1 {
    public final int v;
    public final int f40774w;
    public int f40775x;
    public org.telegram.ui.Components.q61 f40776y;

    public ta1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f40774w = i12;
    }

    @Override
    public final void b(ha1 ha1Var) {
        int i10;
        if (ha1Var != null && (i10 = this.f40775x) >= 0) {
            ha1Var.a(this.v, this.f40774w, i10, this.f40776y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
