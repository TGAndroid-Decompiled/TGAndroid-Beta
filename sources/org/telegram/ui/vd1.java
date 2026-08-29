package org.telegram.ui;
public final class vd1 implements Runnable {
    public final int f43553a;
    public final ze1 f43554b;

    public vd1(ze1 ze1Var, int i10) {
        this.f43553a = i10;
        this.f43554b = ze1Var;
    }

    @Override
    public final void run() {
        switch (this.f43553a) {
            case 0:
                ze1 ze1Var = this.f43554b;
                ze1Var.x0();
                ze1Var.B0();
                return;
            case 1:
                this.f43554b.x0();
                return;
            case 2:
                this.f43554b.O0(true);
                return;
            case 3:
                this.f43554b.finishPreviewFragment();
                return;
            case 4:
                ze1 ze1Var2 = this.f43554b;
                ze1Var2.f45194w0 = null;
                ze1Var2.U0(true, false);
                return;
            default:
                ze1 ze1Var3 = this.f43554b;
                ze1Var3.J.postOnAnimation(new vd1(ze1Var3, 1));
                return;
        }
    }
}
