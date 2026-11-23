package org.telegram.ui;
public final class y81 implements Runnable {
    public final int f54058a;
    public final y91 f54059b;

    public y81(y91 y91Var, int i7) {
        this.f54058a = i7;
        this.f54059b = y91Var;
    }

    @Override
    public final void run() {
        switch (this.f54058a) {
            case 0:
                y91 y91Var = this.f54059b;
                y91Var.B0();
                y91Var.F0();
                return;
            case 1:
                this.f54059b.B0();
                return;
            case 2:
                this.f54059b.S0(true);
                return;
            case 3:
                this.f54059b.finishPreviewFragment();
                return;
            case 4:
                y91 y91Var2 = this.f54059b;
                y91Var2.B0 = null;
                y91Var2.Z0(true, false);
                return;
            default:
                y91 y91Var3 = this.f54059b;
                y91Var3.O.postOnAnimation(new y81(y91Var3, 1));
                return;
        }
    }
}
