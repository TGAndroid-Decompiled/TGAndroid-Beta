package org.telegram.ui;
public final class tf1 implements Runnable {
    public final int f42186a;
    public final uf1 f42187b;

    public tf1(uf1 uf1Var, int i10) {
        this.f42186a = i10;
        this.f42187b = uf1Var;
    }

    @Override
    public final void run() {
        switch (this.f42186a) {
            case 0:
                uf1 uf1Var = this.f42187b;
                uf1Var.F = null;
                if (uf1Var.G != -1) {
                    uf1Var.H.getNotificationCenter().onAnimationFinish(uf1Var.G);
                    uf1Var.G = -1;
                    return;
                }
                return;
            default:
                uf1 uf1Var2 = this.f42187b;
                uf1Var2.F = null;
                if (uf1Var2.G != -1) {
                    uf1Var2.H.getNotificationCenter().onAnimationFinish(uf1Var2.G);
                    uf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
