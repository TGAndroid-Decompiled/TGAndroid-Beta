package org.telegram.ui;
public final class rd1 implements Runnable {
    public final int f40731a;
    public final te1 f40732b;

    public rd1(te1 te1Var, int i10) {
        this.f40731a = i10;
        this.f40732b = te1Var;
    }

    @Override
    public final void run() {
        switch (this.f40731a) {
            case 0:
                te1 te1Var = this.f40732b;
                te1Var.x0();
                te1Var.B0();
                return;
            case 1:
                this.f40732b.x0();
                return;
            case 2:
                this.f40732b.O0(true);
                return;
            case 3:
                this.f40732b.finishPreviewFragment();
                return;
            case 4:
                te1 te1Var2 = this.f40732b;
                te1Var2.A0 = null;
                te1Var2.U0(true, false);
                return;
            default:
                te1 te1Var3 = this.f40732b;
                te1Var3.N.postOnAnimation(new rd1(te1Var3, 1));
                return;
        }
    }
}
