package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class v20 extends s4.s0 {
    public final a50 f42397a;

    public v20(a50 a50Var) {
        this.f42397a = a50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        a50 a50Var = this.f42397a;
        a50Var.f21587b.invalidate();
        a50Var.R3.invalidate();
    }
}
