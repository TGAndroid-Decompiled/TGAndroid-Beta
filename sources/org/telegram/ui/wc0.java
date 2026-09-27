package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wc0 extends s4.s0 {
    public final fd0 f38908a;

    public wc0(fd0 fd0Var) {
        this.f38908a = fd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        fd0 fd0Var = this.f38908a;
        fd0Var.Q = z10;
        if (!z10 && fd0Var.L != null) {
            fd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        fd0 fd0Var = this.f38908a;
        fd0Var.A0(false);
        if (fd0Var.L != null) {
            fd0Var.N += i11;
        }
    }
}
