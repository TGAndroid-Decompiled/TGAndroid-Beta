package org.telegram.ui;
public final class qp0 implements Runnable {
    public final int f39514a;
    public final aq0 f39515b;

    public qp0(aq0 aq0Var, int i10) {
        this.f39514a = i10;
        this.f39515b = aq0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39514a;
        aq0 aq0Var = this.f39515b;
        switch (i10) {
            case 0:
                if (aq0Var.G) {
                    aq0Var.f34305b.invalidate();
                    return;
                }
                return;
            case 1:
                aq0Var.h();
                return;
            case 2:
                int i11 = aq0.f34302q0;
                aq0Var.h();
                return;
            default:
                int i12 = aq0.f34302q0;
                aq0Var.h();
                return;
        }
    }
}
