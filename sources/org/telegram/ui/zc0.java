package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class zc0 extends s4.s0 {
    public final id0 f39258a;

    public zc0(id0 id0Var) {
        this.f39258a = id0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        id0 id0Var = this.f39258a;
        id0Var.Q = z10;
        if (!z10 && id0Var.L != null) {
            id0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        id0 id0Var = this.f39258a;
        id0Var.A0(false);
        if (id0Var.L != null) {
            id0Var.N += i11;
        }
    }
}
