package org.telegram.ui;
public final class y81 implements Runnable {
    public final int f51999a;
    public final y91 f52000b;

    public y81(y91 y91Var, int i7) {
        this.f51999a = i7;
        this.f52000b = y91Var;
    }

    @Override
    public final void run() {
        switch (this.f51999a) {
            case 0:
                y91 y91Var = this.f52000b;
                y91Var.B0();
                y91Var.F0();
                return;
            case 1:
                this.f52000b.B0();
                return;
            case 2:
                this.f52000b.S0(true);
                return;
            case 3:
                this.f52000b.finishPreviewFragment();
                return;
            case 4:
                y91 y91Var2 = this.f52000b;
                y91Var2.A0 = null;
                y91Var2.Z0(true, false);
                return;
            default:
                y91 y91Var3 = this.f52000b;
                y91Var3.N.postOnAnimation(new y81(y91Var3, 1));
                return;
        }
    }
}
