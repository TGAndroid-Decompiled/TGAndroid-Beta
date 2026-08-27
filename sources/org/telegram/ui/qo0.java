package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

public final class qo0 extends f2.b1 {

    public final int f41716a;

    public final vo0 f41717b;

    public qo0(vo0 vo0Var, int i10) {
        this.f41717b = vo0Var;
        this.f41716a = i10;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        vo0 vo0Var = this.f41717b;
        ap0 ap0Var = vo0Var.f43505f0;
        if (vo0Var.B != null) {
            if (vo0Var.A == null || !vo0Var.c()) {
                return;
            }
            vo0Var.A.g(false);
            return;
        }
        hh.m7 m7Var = this.f41716a == 1 ? ap0Var.f36587c : ap0Var.f36586b;
        if (m7Var == null || !vo0Var.c()) {
            return;
        }
        m7Var.a();
    }
}
