package org.telegram.ui;
public final class we1 implements Runnable {
    public final int f42080a;
    public final yf1 f42081b;

    public we1(yf1 yf1Var, int i10) {
        this.f42080a = i10;
        this.f42081b = yf1Var;
    }

    @Override
    public final void run() {
        switch (this.f42080a) {
            case 0:
                yf1 yf1Var = this.f42081b;
                yf1Var.x0();
                yf1Var.B0();
                return;
            case 1:
                this.f42081b.x0();
                return;
            case 2:
                this.f42081b.O0(true);
                return;
            case 3:
                this.f42081b.finishPreviewFragment();
                return;
            case 4:
                yf1 yf1Var2 = this.f42081b;
                yf1Var2.A0 = null;
                yf1Var2.U0(true, false);
                return;
            default:
                yf1 yf1Var3 = this.f42081b;
                yf1Var3.N.postOnAnimation(new we1(yf1Var3, 1));
                return;
        }
    }
}
