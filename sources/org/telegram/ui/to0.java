package org.telegram.ui;
public final class to0 implements Runnable {
    public final int f41793a;
    public final dp0 f41794b;

    public to0(dp0 dp0Var, int i10) {
        this.f41793a = i10;
        this.f41794b = dp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41793a;
        dp0 dp0Var = this.f41794b;
        switch (i10) {
            case 0:
                if (dp0Var.G) {
                    dp0Var.f36244b.invalidate();
                    return;
                }
                return;
            case 1:
                dp0Var.h();
                return;
            case 2:
                int i11 = dp0.f36241q0;
                dp0Var.h();
                return;
            default:
                int i12 = dp0.f36241q0;
                dp0Var.h();
                return;
        }
    }
}
