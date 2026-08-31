package org.telegram.ui;
public final class xg1 implements Runnable {
    public final int f43061a;
    public final yg1 f43062b;

    public xg1(yg1 yg1Var, int i10) {
        this.f43061a = i10;
        this.f43062b = yg1Var;
    }

    @Override
    public final void run() {
        switch (this.f43061a) {
            case 0:
                org.telegram.ui.Components.b61 b61Var = this.f43062b.f25815a;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.b61 b61Var2 = this.f43062b.f25815a;
                if (b61Var2 != null) {
                    b61Var2.V2.N(true);
                    return;
                }
                return;
        }
    }
}
