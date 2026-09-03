package org.telegram.ui;

import java.util.ArrayList;
public final class r4 implements Runnable {
    public final u4 f37697a;

    public r4(u4 u4Var) {
        this.f37697a = u4Var;
    }

    @Override
    public final void run() {
        ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
        p2Var.K = new a0.h();
        p2Var.L = new ArrayList();
        p2Var.f32369x = 1;
        p2Var.D = false;
        u4 u4Var = this.f37697a;
        p2Var.O = u4Var.U();
        p2Var.f32365n = new c1(this, 2);
        u4Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
    }
}
