package org.telegram.ui;

import android.content.Context;
public final class r7 extends org.telegram.ui.Cells.j7 {
    public final m7 f39938l0;
    public final s7 m0;

    public r7(s7 s7Var, Context context, m7 m7Var) {
        super(context, 0, null);
        this.m0 = s7Var;
        this.f39938l0 = m7Var;
    }

    @Override
    public final void a() {
        v7 v7Var = this.m0.f40374n;
        m7 m7Var = this.f39938l0;
        v7.b(v7Var, (zh.a) m7Var.getTag(), m7Var);
    }
}
