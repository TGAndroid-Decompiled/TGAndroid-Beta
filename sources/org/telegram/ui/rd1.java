package org.telegram.ui;
public final class rd1 implements Runnable {
    public final int f40706a;
    public final te1 f40707b;

    public rd1(te1 te1Var, int i10) {
        this.f40706a = i10;
        this.f40707b = te1Var;
    }

    @Override
    public final void run() {
        switch (this.f40706a) {
            case 0:
                te1 te1Var = this.f40707b;
                te1Var.x0();
                te1Var.B0();
                return;
            case 1:
                this.f40707b.x0();
                return;
            case 2:
                this.f40707b.O0(true);
                return;
            case 3:
                this.f40707b.finishPreviewFragment();
                return;
            case 4:
                te1 te1Var2 = this.f40707b;
                te1Var2.A0 = null;
                te1Var2.U0(true, false);
                return;
            default:
                te1 te1Var3 = this.f40707b;
                te1Var3.N.postOnAnimation(new rd1(te1Var3, 1));
                return;
        }
    }
}
