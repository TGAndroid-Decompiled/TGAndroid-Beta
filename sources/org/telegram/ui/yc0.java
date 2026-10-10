package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class yc0 extends s4.t0 {
    public final hd0 f44358a;

    public yc0(hd0 hd0Var) {
        this.f44358a = hd0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        hd0 hd0Var = this.f44358a;
        hd0Var.Q = z10;
        if (!z10 && hd0Var.L != null) {
            hd0Var.L = null;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        hd0 hd0Var = this.f44358a;
        hd0Var.z0(false);
        if (hd0Var.L != null) {
            hd0Var.N += i11;
        }
    }
}
