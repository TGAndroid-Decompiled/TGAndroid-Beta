package org.telegram.ui;
public final class sl0 implements Runnable {
    public final int f51241a;
    public final cm0 f51242b;

    public sl0(cm0 cm0Var, int i7) {
        this.f51241a = i7;
        this.f51242b = cm0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f51241a;
        cm0 cm0Var = this.f51242b;
        switch (i7) {
            case 0:
                if (cm0Var.H) {
                    cm0Var.f46191b.invalidate();
                    return;
                }
                return;
            case 1:
                cm0Var.h();
                return;
            case 2:
                int i10 = cm0.f46188r0;
                cm0Var.h();
                return;
            default:
                int i11 = cm0.f46188r0;
                cm0Var.h();
                return;
        }
    }
}
