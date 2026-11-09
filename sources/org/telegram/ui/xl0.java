package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class xl0 extends v4.s0 {
    public final int f51689a;
    public final dm0 f51690b;

    public xl0(dm0 dm0Var, int i7) {
        this.f51690b = dm0Var;
        this.f51689a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        bi.v9 v9Var;
        dm0 dm0Var = this.f51690b;
        jm0 jm0Var = dm0Var.f45078p0;
        dm0Var.h();
        if (dm0Var.K != null) {
            if (dm0Var.J != null && dm0Var.c()) {
                dm0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f51689a == 1) {
            v9Var = jm0Var.f47040c;
        } else {
            v9Var = jm0Var.f47038b;
        }
        if (v9Var != null && dm0Var.c()) {
            v9Var.a();
        }
    }
}
