package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class z10 extends v4.t0 {
    public final f40 f54332a;

    public z10(f40 f40Var) {
        this.f54332a = f40Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        f40 f40Var = this.f54332a;
        f40Var.f30142b.invalidate();
        f40Var.Z3.invalidate();
    }
}
