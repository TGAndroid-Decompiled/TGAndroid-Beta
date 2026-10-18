package org.telegram.ui;
public final class rd1 implements Runnable {
    public final int f40697a;
    public final te1 f40698b;

    public rd1(te1 te1Var, int i10) {
        this.f40697a = i10;
        this.f40698b = te1Var;
    }

    @Override
    public final void run() {
        switch (this.f40697a) {
            case 0:
                te1 te1Var = this.f40698b;
                te1Var.x0();
                te1Var.B0();
                return;
            case 1:
                this.f40698b.x0();
                return;
            case 2:
                this.f40698b.O0(true);
                return;
            case 3:
                this.f40698b.finishPreviewFragment();
                return;
            case 4:
                te1 te1Var2 = this.f40698b;
                te1Var2.A0 = null;
                te1Var2.U0(true, false);
                return;
            default:
                te1 te1Var3 = this.f40698b;
                te1Var3.N.postOnAnimation(new rd1(te1Var3, 1));
                return;
        }
    }
}
