package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class xl0 extends v4.u0 {
    public final int f53995a;
    public final dm0 f53996b;

    public xl0(dm0 dm0Var, int i7) {
        this.f53996b = dm0Var;
        this.f53995a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        di.p8 p8Var;
        dm0 dm0Var = this.f53996b;
        jm0 jm0Var = dm0Var.f47185q0;
        dm0Var.h();
        if (dm0Var.L != null) {
            if (dm0Var.K != null && dm0Var.c()) {
                dm0Var.K.l(false);
                return;
            }
            return;
        }
        if (this.f53995a == 1) {
            p8Var = jm0Var.f49158c;
        } else {
            p8Var = jm0Var.f49156b;
        }
        if (p8Var != null && dm0Var.c()) {
            p8Var.a();
        }
    }
}
