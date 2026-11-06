package org.telegram.ui;
public final class tj0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50087a;
    public final xj0 f50088b;

    public tj0(xj0 xj0Var, int i7) {
        this.f50087a = i7;
        this.f50088b = xj0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50087a) {
            case 0:
                xj0 xj0Var = this.f50088b;
                xj0Var.c(true);
                xj0Var.Q.finishFragment();
                return;
            default:
                xj0 xj0Var2 = this.f50088b;
                xj0Var2.c(true);
                xj0Var2.Q.O1(null, 0, true);
                return;
        }
    }
}
