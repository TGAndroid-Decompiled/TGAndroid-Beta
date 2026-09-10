package org.telegram.ui;
public final class uf1 implements Runnable {
    public final int f37257a;
    public final vf1 f37258b;

    public uf1(vf1 vf1Var, int i10) {
        this.f37257a = i10;
        this.f37258b = vf1Var;
    }

    @Override
    public final void run() {
        switch (this.f37257a) {
            case 0:
                vf1 vf1Var = this.f37258b;
                vf1Var.F = null;
                if (vf1Var.G != -1) {
                    vf1Var.H.getNotificationCenter().onAnimationFinish(vf1Var.G);
                    vf1Var.G = -1;
                    return;
                }
                return;
            default:
                vf1 vf1Var2 = this.f37258b;
                vf1Var2.F = null;
                if (vf1Var2.G != -1) {
                    vf1Var2.H.getNotificationCenter().onAnimationFinish(vf1Var2.G);
                    vf1Var2.G = -1;
                    return;
                }
                return;
        }
    }
}
