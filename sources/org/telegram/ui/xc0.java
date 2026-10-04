package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class xc0 extends s4.s0 {
    public final gd0 f42827a;

    public xc0(gd0 gd0Var) {
        this.f42827a = gd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        gd0 gd0Var = this.f42827a;
        gd0Var.Q = z10;
        if (!z10 && gd0Var.L != null) {
            gd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        gd0 gd0Var = this.f42827a;
        gd0Var.A0(false);
        if (gd0Var.L != null) {
            gd0Var.N += i11;
        }
    }
}
