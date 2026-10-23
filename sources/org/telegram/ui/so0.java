package org.telegram.ui;
public final class so0 implements Runnable {
    public final int f41506a;
    public final cp0 f41507b;

    public so0(cp0 cp0Var, int i10) {
        this.f41506a = i10;
        this.f41507b = cp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41506a;
        cp0 cp0Var = this.f41507b;
        switch (i10) {
            case 0:
                if (cp0Var.G) {
                    cp0Var.f36025b.invalidate();
                    return;
                }
                return;
            case 1:
                cp0Var.h();
                return;
            case 2:
                int i11 = cp0.f36022q0;
                cp0Var.h();
                return;
            default:
                int i12 = cp0.f36022q0;
                cp0Var.h();
                return;
        }
    }
}
