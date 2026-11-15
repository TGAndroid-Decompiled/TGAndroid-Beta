package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wl0 extends v4.t0 {
    public final int f52931a;
    public final cm0 f52932b;

    public wl0(cm0 cm0Var, int i7) {
        this.f52932b = cm0Var;
        this.f52931a = i7;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        di.m8 m8Var;
        cm0 cm0Var = this.f52932b;
        im0 im0Var = cm0Var.f46210q0;
        cm0Var.h();
        if (cm0Var.L != null) {
            if (cm0Var.K != null && cm0Var.c()) {
                cm0Var.K.g(false);
                return;
            }
            return;
        }
        if (this.f52931a == 1) {
            m8Var = im0Var.f48088c;
        } else {
            m8Var = im0Var.f48086b;
        }
        if (m8Var != null && cm0Var.c()) {
            m8Var.a();
        }
    }
}
