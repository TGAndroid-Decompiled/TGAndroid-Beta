package org.telegram.ui;
public final class z00 implements Runnable {
    public final int f39146a;
    public final a10 f39147b;

    public z00(a10 a10Var, int i10) {
        this.f39146a = i10;
        this.f39147b = a10Var;
    }

    @Override
    public final void run() {
        switch (this.f39146a) {
            case 0:
                this.f39147b.d();
                return;
            case 1:
                this.f39147b.a();
                return;
            default:
                a10 a10Var = this.f39147b;
                a10Var.b(a10Var.f30775y);
                return;
        }
    }
}
