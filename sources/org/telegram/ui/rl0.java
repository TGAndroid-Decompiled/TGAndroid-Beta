package org.telegram.ui;
public final class rl0 implements Runnable {
    public final int f49531a;
    public final bm0 f49532b;

    public rl0(bm0 bm0Var, int i7) {
        this.f49531a = i7;
        this.f49532b = bm0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f49531a;
        bm0 bm0Var = this.f49532b;
        switch (i7) {
            case 0:
                if (bm0Var.G) {
                    bm0Var.f44429b.invalidate();
                    return;
                }
                return;
            case 1:
                bm0Var.h();
                return;
            case 2:
                int i10 = bm0.f44426q0;
                bm0Var.h();
                return;
            default:
                int i11 = bm0.f44426q0;
                bm0Var.h();
                return;
        }
    }
}
