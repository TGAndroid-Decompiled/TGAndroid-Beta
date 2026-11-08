package org.telegram.ui;
public final class x81 implements Runnable {
    public final int f51798a;
    public final w91 f51799b;

    public x81(w91 w91Var, int i7) {
        this.f51798a = i7;
        this.f51799b = w91Var;
    }

    @Override
    public final void run() {
        switch (this.f51798a) {
            case 0:
                w91 w91Var = this.f51799b;
                w91Var.B0();
                w91Var.F0();
                return;
            case 1:
                this.f51799b.B0();
                return;
            case 2:
                this.f51799b.S0(true);
                return;
            case 3:
                this.f51799b.finishPreviewFragment();
                return;
            case 4:
                w91 w91Var2 = this.f51799b;
                w91Var2.A0 = null;
                w91Var2.Z0(true, false);
                return;
            default:
                w91 w91Var3 = this.f51799b;
                w91Var3.N.postOnAnimation(new x81(w91Var3, 1));
                return;
        }
    }
}
