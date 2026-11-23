package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class zl0 extends v4.u0 {
    public final int f54583a;
    public final fm0 f54584b;

    public zl0(fm0 fm0Var, int i7) {
        this.f54584b = fm0Var;
        this.f54583a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        di.p8 p8Var;
        fm0 fm0Var = this.f54584b;
        lm0 lm0Var = fm0Var.f47786q0;
        fm0Var.h();
        if (fm0Var.L != null) {
            if (fm0Var.K != null && fm0Var.c()) {
                fm0Var.K.l(false);
                return;
            }
            return;
        }
        if (this.f54583a == 1) {
            p8Var = lm0Var.f49650c;
        } else {
            p8Var = lm0Var.f49648b;
        }
        if (p8Var != null && fm0Var.c()) {
            p8Var.a();
        }
    }
}
