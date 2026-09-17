package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42525a;
    public final y00 f42526b;

    public x00(y00 y00Var, int i10) {
        this.f42525a = i10;
        this.f42526b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42525a) {
            case 0:
                this.f42526b.d();
                return;
            case 1:
                this.f42526b.a();
                return;
            default:
                y00 y00Var = this.f42526b;
                y00Var.b(y00Var.f42937y);
                return;
        }
    }
}
