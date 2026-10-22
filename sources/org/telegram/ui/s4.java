package org.telegram.ui;

import java.util.ArrayList;
public final class s4 implements Runnable {
    public final v4 f41363a;

    public s4(v4 v4Var) {
        this.f41363a = v4Var;
    }

    @Override
    public final void run() {
        ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
        n2Var.N = new a0.h();
        n2Var.O = new ArrayList();
        n2Var.f33967x = 1;
        n2Var.G = false;
        v4 v4Var = this.f41363a;
        n2Var.R = v4Var.U();
        n2Var.f33963n = new b1(this, 2);
        v4Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
    }
}
