package org.telegram.ui;
public final class wh1 implements Runnable {
    public final int f41293a;
    public final xh1 f41294b;

    public wh1(xh1 xh1Var, int i10) {
        this.f41293a = i10;
        this.f41294b = xh1Var;
    }

    @Override
    public final void run() {
        switch (this.f41293a) {
            case 0:
                org.telegram.ui.Components.c71 c71Var = this.f41294b.f24003a;
                if (c71Var != null) {
                    c71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.c71 c71Var2 = this.f41294b.f24003a;
                if (c71Var2 != null) {
                    c71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
