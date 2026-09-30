package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class tc0 extends s4.s0 {
    public final cd0 f38047a;

    public tc0(cd0 cd0Var) {
        this.f38047a = cd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cd0 cd0Var = this.f38047a;
        cd0Var.Q = z10;
        if (!z10 && cd0Var.L != null) {
            cd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        cd0 cd0Var = this.f38047a;
        cd0Var.A0(false);
        if (cd0Var.L != null) {
            cd0Var.N += i11;
        }
    }
}
