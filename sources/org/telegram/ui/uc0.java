package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class uc0 extends s4.s0 {
    public final dd0 f38050a;

    public uc0(dd0 dd0Var) {
        this.f38050a = dd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dd0 dd0Var = this.f38050a;
        dd0Var.Q = z10;
        if (!z10 && dd0Var.L != null) {
            dd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        dd0 dd0Var = this.f38050a;
        dd0Var.A0(false);
        if (dd0Var.L != null) {
            dd0Var.N += i11;
        }
    }
}
