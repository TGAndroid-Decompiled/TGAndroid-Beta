package org.telegram.ui;
public final class vg1 implements Runnable {
    public final int f39170a;
    public final wg1 f39171b;

    public vg1(wg1 wg1Var, int i10) {
        this.f39170a = i10;
        this.f39171b = wg1Var;
    }

    @Override
    public final void run() {
        switch (this.f39170a) {
            case 0:
                org.telegram.ui.Components.a61 a61Var = this.f39171b.f23580a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.a61 a61Var2 = this.f39171b.f23580a;
                if (a61Var2 != null) {
                    a61Var2.V2.N(true);
                    return;
                }
                return;
        }
    }
}
