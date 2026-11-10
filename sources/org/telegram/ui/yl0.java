package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class yl0 extends v4.s0 {
    public final int f52066a;
    public final em0 f52067b;

    public yl0(em0 em0Var, int i7) {
        this.f52067b = em0Var;
        this.f52066a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        bi.v9 v9Var;
        em0 em0Var = this.f52067b;
        km0 km0Var = em0Var.f45401p0;
        em0Var.h();
        if (em0Var.K != null) {
            if (em0Var.J != null && em0Var.c()) {
                em0Var.J.g(false);
                return;
            }
            return;
        }
        if (this.f52066a == 1) {
            v9Var = km0Var.f47371c;
        } else {
            v9Var = km0Var.f47369b;
        }
        if (v9Var != null && em0Var.c()) {
            v9Var.a();
        }
    }
}
