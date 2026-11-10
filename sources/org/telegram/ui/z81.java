package org.telegram.ui;
public final class z81 implements Runnable {
    public final int f52329a;
    public final z91 f52330b;

    public z81(z91 z91Var, int i7) {
        this.f52329a = i7;
        this.f52330b = z91Var;
    }

    @Override
    public final void run() {
        switch (this.f52329a) {
            case 0:
                z91 z91Var = this.f52330b;
                z91Var.B0();
                z91Var.F0();
                return;
            case 1:
                this.f52330b.B0();
                return;
            case 2:
                this.f52330b.S0(true);
                return;
            case 3:
                this.f52330b.finishPreviewFragment();
                return;
            case 4:
                z91 z91Var2 = this.f52330b;
                z91Var2.A0 = null;
                z91Var2.Z0(true, false);
                return;
            default:
                z91 z91Var3 = this.f52330b;
                z91Var3.N.postOnAnimation(new z81(z91Var3, 1));
                return;
        }
    }
}
