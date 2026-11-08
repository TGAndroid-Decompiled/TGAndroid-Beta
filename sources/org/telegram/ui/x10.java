package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class x10 extends v4.s0 {
    public final c40 f51722a;

    public x10(c40 c40Var) {
        this.f51722a = c40Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        c40 c40Var = this.f51722a;
        c40Var.f28619b.invalidate();
        c40Var.R3.invalidate();
    }
}
