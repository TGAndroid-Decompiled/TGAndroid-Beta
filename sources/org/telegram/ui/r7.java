package org.telegram.ui;

import android.content.Context;
public final class r7 extends org.telegram.ui.Cells.h7 {
    public final m7 f40763i0;
    public final s7 f40764j0;

    public r7(s7 s7Var, Context context, m7 m7Var) {
        super(context, 0, null);
        this.f40764j0 = s7Var;
        this.f40763i0 = m7Var;
    }

    @Override
    public final void a() {
        u7 u7Var = this.f40764j0.f41040n;
        m7 m7Var = this.f40763i0;
        u7.b(u7Var, (nh.a) m7Var.getTag(), m7Var);
    }
}
