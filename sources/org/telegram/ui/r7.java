package org.telegram.ui;

import android.content.Context;
public final class r7 extends org.telegram.ui.Cells.i7 {
    public final m7 f37108l0;
    public final s7 m0;

    public r7(s7 s7Var, Context context, m7 m7Var) {
        super(context, 0, null);
        this.m0 = s7Var;
        this.f37108l0 = m7Var;
    }

    @Override
    public final void a() {
        u7 u7Var = this.m0.f37401n;
        m7 m7Var = this.f37108l0;
        u7.b(u7Var, (zh.a) m7Var.getTag(), m7Var);
    }
}
