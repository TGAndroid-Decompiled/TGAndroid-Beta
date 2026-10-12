package org.telegram.ui;
public final class wh1 implements Runnable {
    public final int f41606a;
    public final xh1 f41607b;

    public wh1(xh1 xh1Var, int i10) {
        this.f41606a = i10;
        this.f41607b = xh1Var;
    }

    @Override
    public final void run() {
        switch (this.f41606a) {
            case 0:
                org.telegram.ui.Components.b71 b71Var = this.f41607b.f23964a;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.b71 b71Var2 = this.f41607b.f23964a;
                if (b71Var2 != null) {
                    b71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
