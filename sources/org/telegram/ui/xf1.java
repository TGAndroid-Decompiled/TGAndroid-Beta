package org.telegram.ui;
public final class xf1 implements Runnable {
    public final int f41853a;
    public final yf1 f41854b;

    public xf1(yf1 yf1Var, int i10) {
        this.f41853a = i10;
        this.f41854b = yf1Var;
    }

    @Override
    public final void run() {
        switch (this.f41853a) {
            case 0:
                yf1 yf1Var = this.f41854b;
                yf1Var.F = null;
                if (yf1Var.G != -1) {
                    yf1Var.H.getNotificationCenter().onAnimationFinish(yf1Var.G);
                    yf1Var.G = -1;
                    return;
                }
                return;
            default:
                yf1 yf1Var2 = this.f41854b;
                yf1Var2.F = null;
                if (yf1Var2.G != -1) {
                    yf1Var2.H.getNotificationCenter().onAnimationFinish(yf1Var2.G);
                    yf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
