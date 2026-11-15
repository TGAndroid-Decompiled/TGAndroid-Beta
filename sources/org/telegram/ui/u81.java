package org.telegram.ui;
public final class u81 implements Runnable {
    public final int f51828a;
    public final u91 f51829b;

    public u81(u91 u91Var, int i7) {
        this.f51828a = i7;
        this.f51829b = u91Var;
    }

    @Override
    public final void run() {
        switch (this.f51828a) {
            case 0:
                u91 u91Var = this.f51829b;
                u91Var.B0();
                u91Var.F0();
                return;
            case 1:
                this.f51829b.B0();
                return;
            case 2:
                this.f51829b.S0(true);
                return;
            case 3:
                this.f51829b.finishPreviewFragment();
                return;
            case 4:
                u91 u91Var2 = this.f51829b;
                u91Var2.B0 = null;
                u91Var2.Z0(true, false);
                return;
            default:
                u91 u91Var3 = this.f51829b;
                u91Var3.O.postOnAnimation(new u81(u91Var3, 1));
                return;
        }
    }
}
