package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class z10 extends v4.s0 {
    public final e40 f52388a;

    public z10(e40 e40Var) {
        this.f52388a = e40Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        e40 e40Var = this.f52388a;
        e40Var.f28624b.invalidate();
        e40Var.R3.invalidate();
    }
}
