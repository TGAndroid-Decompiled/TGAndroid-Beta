package org.telegram.ui;

import java.util.ArrayList;
public final class r4 implements Runnable {
    public final u4 f39273a;

    public r4(u4 u4Var) {
        this.f39273a = u4Var;
    }

    @Override
    public final void run() {
        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
        m2Var.N = new a0.h();
        m2Var.O = new ArrayList();
        m2Var.f32609x = 1;
        m2Var.G = false;
        u4 u4Var = this.f39273a;
        m2Var.R = u4Var.U();
        m2Var.f32605n = new b1(this, 2);
        u4Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
    }
}
