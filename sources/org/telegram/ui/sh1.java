package org.telegram.ui;
public final class sh1 implements Runnable {
    public final int f41928a;
    public final th1 f41929b;

    public sh1(th1 th1Var, int i10) {
        this.f41928a = i10;
        this.f41929b = th1Var;
    }

    @Override
    public final void run() {
        switch (this.f41928a) {
            case 0:
                org.telegram.ui.Components.j71 j71Var = this.f41929b.f27773a;
                if (j71Var != null) {
                    j71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.j71 j71Var2 = this.f41929b.f27773a;
                if (j71Var2 != null) {
                    j71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
