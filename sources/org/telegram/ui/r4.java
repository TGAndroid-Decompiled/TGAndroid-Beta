package org.telegram.ui;

import java.util.ArrayList;
public final class r4 implements Runnable {
    public final u4 f41023a;

    public r4(u4 u4Var) {
        this.f41023a = u4Var;
    }

    @Override
    public final void run() {
        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
        o2Var.N = new a0.h();
        o2Var.O = new ArrayList();
        o2Var.f34267x = 1;
        o2Var.G = false;
        u4 u4Var = this.f41023a;
        o2Var.R = u4Var.U();
        o2Var.f34263n = new a1(this, 2);
        u4Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
    }
}
