package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class vl0 extends v4.s0 {
    public final int f50746a;
    public final bm0 f50747b;

    public vl0(bm0 bm0Var, int i7) {
        this.f50747b = bm0Var;
        this.f50746a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        bi.v9 v9Var;
        bm0 bm0Var = this.f50747b;
        hm0 hm0Var = bm0Var.f44431p0;
        bm0Var.h();
        if (bm0Var.K != null) {
            if (bm0Var.J != null && bm0Var.c()) {
                bm0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f50746a == 1) {
            v9Var = hm0Var.f46434c;
        } else {
            v9Var = hm0Var.f46432b;
        }
        if (v9Var != null && bm0Var.c()) {
            v9Var.a();
        }
    }
}
