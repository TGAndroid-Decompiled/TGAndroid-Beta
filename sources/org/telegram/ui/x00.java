package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f39303a;
    public final y00 f39304b;

    public x00(y00 y00Var, int i10) {
        this.f39303a = i10;
        this.f39304b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f39303a) {
            case 0:
                this.f39304b.d();
                return;
            case 1:
                this.f39304b.a();
                return;
            default:
                y00 y00Var = this.f39304b;
                y00Var.b(y00Var.f39788y);
                return;
        }
    }
}
