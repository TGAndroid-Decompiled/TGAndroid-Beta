package org.telegram.ui;
public final class we1 implements Runnable {
    public final int f39408a;
    public final xe1 f39409b;

    public we1(xe1 xe1Var, int i10) {
        this.f39408a = i10;
        this.f39409b = xe1Var;
    }

    @Override
    public final void run() {
        switch (this.f39408a) {
            case 0:
                xe1 xe1Var = this.f39409b;
                xe1Var.F = null;
                if (xe1Var.G != -1) {
                    xe1Var.H.getNotificationCenter().onAnimationFinish(xe1Var.G);
                    xe1Var.G = -1;
                    return;
                }
                return;
            default:
                xe1 xe1Var2 = this.f39409b;
                xe1Var2.F = null;
                if (xe1Var2.G != -1) {
                    xe1Var2.H.getNotificationCenter().onAnimationFinish(xe1Var2.G);
                    xe1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
