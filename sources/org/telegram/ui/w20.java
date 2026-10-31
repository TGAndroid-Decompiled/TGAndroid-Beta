package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class w20 extends s4.s0 {
    public final b50 f42863a;

    public w20(b50 b50Var) {
        this.f42863a = b50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b50 b50Var = this.f42863a;
        b50Var.f21586b.invalidate();
        b50Var.R3.invalidate();
    }
}
