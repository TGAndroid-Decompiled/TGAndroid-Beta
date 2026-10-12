package org.telegram.ui;
public final class sh1 implements Runnable {
    public final int f41932a;
    public final th1 f41933b;

    public sh1(th1 th1Var, int i10) {
        this.f41932a = i10;
        this.f41933b = th1Var;
    }

    @Override
    public final void run() {
        switch (this.f41932a) {
            case 0:
                org.telegram.ui.Components.j71 j71Var = this.f41933b.f27776a;
                if (j71Var != null) {
                    j71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.j71 j71Var2 = this.f41933b.f27776a;
                if (j71Var2 != null) {
                    j71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
