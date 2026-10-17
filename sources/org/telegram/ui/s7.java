package org.telegram.ui;

import android.content.Context;
public final class s7 extends org.telegram.ui.Cells.h7 {
    public final n7 f41028l0;
    public final t7 m0;

    public s7(t7 t7Var, Context context, n7 n7Var) {
        super(context, 0, null);
        this.m0 = t7Var;
        this.f41028l0 = n7Var;
    }

    @Override
    public final void a() {
        v7 v7Var = this.m0.f41601n;
        n7 n7Var = this.f41028l0;
        v7.b(v7Var, (bi.b) n7Var.getTag(), n7Var);
    }
}
