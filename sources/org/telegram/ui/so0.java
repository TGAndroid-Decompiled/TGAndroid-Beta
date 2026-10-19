package org.telegram.ui;
public final class so0 implements Runnable {
    public final int f41497a;
    public final cp0 f41498b;

    public so0(cp0 cp0Var, int i10) {
        this.f41497a = i10;
        this.f41498b = cp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41497a;
        cp0 cp0Var = this.f41498b;
        switch (i10) {
            case 0:
                if (cp0Var.G) {
                    cp0Var.f36042b.invalidate();
                    return;
                }
                return;
            case 1:
                cp0Var.h();
                return;
            case 2:
                int i11 = cp0.f36039q0;
                cp0Var.h();
                return;
            default:
                int i12 = cp0.f36039q0;
                cp0Var.h();
                return;
        }
    }
}
