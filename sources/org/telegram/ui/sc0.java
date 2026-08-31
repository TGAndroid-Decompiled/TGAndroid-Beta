package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class sc0 extends f2.a1 {
    public final bd0 f41228a;

    public sc0(bd0 bd0Var) {
        this.f41228a = bd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        if (i10 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        bd0 bd0Var = this.f41228a;
        bd0Var.N = z4;
        if (!z4 && bd0Var.I != null) {
            bd0Var.I = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bd0 bd0Var = this.f41228a;
        bd0Var.A0(false);
        if (bd0Var.I != null) {
            bd0Var.K += i11;
        }
    }
}
