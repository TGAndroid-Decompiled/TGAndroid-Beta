package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class s10 extends u4.t0 {
    public final x30 f49333a;

    public s10(x30 x30Var) {
        this.f49333a = x30Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        x30 x30Var = this.f49333a;
        x30Var.f28586b.invalidate();
        x30Var.S3.invalidate();
    }
}
