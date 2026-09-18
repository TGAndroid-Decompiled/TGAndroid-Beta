package org.telegram.ui;
public final class rf1 implements Runnable {
    public final int f37225a;
    public final sf1 f37226b;

    public rf1(sf1 sf1Var, int i10) {
        this.f37225a = i10;
        this.f37226b = sf1Var;
    }

    @Override
    public final void run() {
        switch (this.f37225a) {
            case 0:
                sf1 sf1Var = this.f37226b;
                sf1Var.F = null;
                if (sf1Var.G != -1) {
                    sf1Var.H.getNotificationCenter().onAnimationFinish(sf1Var.G);
                    sf1Var.G = -1;
                    return;
                }
                return;
            default:
                sf1 sf1Var2 = this.f37226b;
                sf1Var2.F = null;
                if (sf1Var2.G != -1) {
                    sf1Var2.H.getNotificationCenter().onAnimationFinish(sf1Var2.G);
                    sf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
