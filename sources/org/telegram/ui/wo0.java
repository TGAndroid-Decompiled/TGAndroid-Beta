package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wo0 extends f2.z0 {
    public final int f39777a;
    public final bp0 f39778b;

    public wo0(bp0 bp0Var, int i10) {
        this.f39778b = bp0Var;
        this.f39777a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lh.l7 l7Var;
        bp0 bp0Var = this.f39778b;
        gp0 gp0Var = bp0Var.f33007g0;
        if (bp0Var.C != null) {
            if (bp0Var.B != null && bp0Var.c()) {
                bp0Var.B.g(false);
                return;
            }
            return;
        }
        if (this.f39777a == 1) {
            l7Var = gp0Var.f34655c;
        } else {
            l7Var = gp0Var.f34654b;
        }
        if (l7Var != null && bp0Var.c()) {
            l7Var.a();
        }
    }
}
