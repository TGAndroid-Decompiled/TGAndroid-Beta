package org.telegram.ui;
public final class tl0 implements Runnable {
    public final int f51609a;
    public final dm0 f51610b;

    public tl0(dm0 dm0Var, int i7) {
        this.f51609a = i7;
        this.f51610b = dm0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f51609a;
        dm0 dm0Var = this.f51610b;
        switch (i7) {
            case 0:
                if (dm0Var.H) {
                    dm0Var.f46400b.invalidate();
                    return;
                }
                return;
            case 1:
                dm0Var.h();
                return;
            case 2:
                int i10 = dm0.f46397r0;
                dm0Var.h();
                return;
            default:
                int i11 = dm0.f46397r0;
                dm0Var.h();
                return;
        }
    }
}
