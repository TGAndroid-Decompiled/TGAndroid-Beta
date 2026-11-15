package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class xl0 extends v4.t0 {
    public final int f53264a;
    public final dm0 f53265b;

    public xl0(dm0 dm0Var, int i7) {
        this.f53265b = dm0Var;
        this.f53264a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        di.l8 l8Var;
        dm0 dm0Var = this.f53265b;
        jm0 jm0Var = dm0Var.f46419q0;
        dm0Var.h();
        if (dm0Var.L != null) {
            if (dm0Var.K != null && dm0Var.c()) {
                dm0Var.K.g(false);
                return;
            }
            return;
        }
        if (this.f53264a == 1) {
            l8Var = jm0Var.f48372c;
        } else {
            l8Var = jm0Var.f48370b;
        }
        if (l8Var != null && dm0Var.c()) {
            l8Var.a();
        }
    }
}
