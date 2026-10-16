package org.telegram.ui;
public final class wf1 implements Runnable {
    public final int f41278a;
    public final xf1 f41279b;

    public wf1(xf1 xf1Var, int i10) {
        this.f41278a = i10;
        this.f41279b = xf1Var;
    }

    @Override
    public final void run() {
        switch (this.f41278a) {
            case 0:
                xf1 xf1Var = this.f41279b;
                xf1Var.F = null;
                if (xf1Var.G != -1) {
                    xf1Var.H.getNotificationCenter().onAnimationFinish(xf1Var.G);
                    xf1Var.G = -1;
                    return;
                }
                return;
            default:
                xf1 xf1Var2 = this.f41279b;
                xf1Var2.F = null;
                if (xf1Var2.G != -1) {
                    xf1Var2.H.getNotificationCenter().onAnimationFinish(xf1Var2.G);
                    xf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
