package org.telegram.ui;

import android.content.Context;
public final class t7 extends org.telegram.ui.Cells.j7 {
    public final o7 f40300l0;
    public final u7 m0;

    public t7(u7 u7Var, Context context, o7 o7Var) {
        super(context, 0, null);
        this.m0 = u7Var;
        this.f40300l0 = o7Var;
    }

    @Override
    public final void a() {
        w7 w7Var = this.m0.f40555n;
        o7 o7Var = this.f40300l0;
        w7.b(w7Var, (ai.b) o7Var.getTag(), o7Var);
    }
}
