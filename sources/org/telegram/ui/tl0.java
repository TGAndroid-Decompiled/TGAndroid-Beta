package org.telegram.ui;
public final class tl0 implements Runnable {
    public final int f52423a;
    public final dm0 f52424b;

    public tl0(dm0 dm0Var, int i7) {
        this.f52423a = i7;
        this.f52424b = dm0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f52423a;
        dm0 dm0Var = this.f52424b;
        switch (i7) {
            case 0:
                if (dm0Var.H) {
                    dm0Var.f47166b.invalidate();
                    return;
                }
                return;
            case 1:
                dm0Var.h();
                return;
            case 2:
                int i10 = dm0.f47163r0;
                dm0Var.h();
                return;
            default:
                int i11 = dm0.f47163r0;
                dm0Var.h();
                return;
        }
    }
}
