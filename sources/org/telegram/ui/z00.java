package org.telegram.ui;
public final class z00 implements Runnable {
    public final int f44587a;
    public final a10 f44588b;

    public z00(a10 a10Var, int i10) {
        this.f44587a = i10;
        this.f44588b = a10Var;
    }

    @Override
    public final void run() {
        switch (this.f44587a) {
            case 0:
                this.f44588b.d();
                return;
            case 1:
                this.f44588b.a();
                return;
            default:
                a10 a10Var = this.f44588b;
                a10Var.b(a10Var.f35664y);
                return;
        }
    }
}
