package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class zl0 extends v4.u0 {
    public final int f54532a;
    public final fm0 f54533b;

    public zl0(fm0 fm0Var, int i7) {
        this.f54533b = fm0Var;
        this.f54532a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        di.o8 o8Var;
        fm0 fm0Var = this.f54533b;
        lm0 lm0Var = fm0Var.f47715q0;
        fm0Var.h();
        if (fm0Var.L != null) {
            if (fm0Var.K != null && fm0Var.c()) {
                fm0Var.K.l(false);
                return;
            }
            return;
        }
        if (this.f54532a == 1) {
            o8Var = lm0Var.f49595c;
        } else {
            o8Var = lm0Var.f49593b;
        }
        if (o8Var != null && fm0Var.c()) {
            o8Var.a();
        }
    }
}
