package org.telegram.ui;
public final class ye1 implements Runnable {
    public final int f43616a;
    public final ze1 f43617b;

    public ye1(ze1 ze1Var, int i10) {
        this.f43616a = i10;
        this.f43617b = ze1Var;
    }

    @Override
    public final void run() {
        switch (this.f43616a) {
            case 0:
                ze1 ze1Var = this.f43617b;
                ze1Var.F = null;
                if (ze1Var.G != -1) {
                    ze1Var.H.getNotificationCenter().onAnimationFinish(ze1Var.G);
                    ze1Var.G = -1;
                    return;
                }
                return;
            default:
                ze1 ze1Var2 = this.f43617b;
                ze1Var2.F = null;
                if (ze1Var2.G != -1) {
                    ze1Var2.H.getNotificationCenter().onAnimationFinish(ze1Var2.G);
                    ze1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
