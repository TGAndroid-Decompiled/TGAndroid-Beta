package org.telegram.ui;
public final class tl0 implements Runnable {
    public final int f50199a;
    public final dm0 f50200b;

    public tl0(dm0 dm0Var, int i7) {
        this.f50199a = i7;
        this.f50200b = dm0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f50199a;
        dm0 dm0Var = this.f50200b;
        switch (i7) {
            case 0:
                if (dm0Var.G) {
                    dm0Var.f45060b.invalidate();
                    return;
                }
                return;
            case 1:
                dm0Var.h();
                return;
            case 2:
                int i10 = dm0.f45057q0;
                dm0Var.h();
                return;
            default:
                int i11 = dm0.f45057q0;
                dm0Var.h();
                return;
        }
    }
}
