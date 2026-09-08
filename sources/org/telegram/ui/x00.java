package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42551a;
    public final y00 f42552b;

    public x00(y00 y00Var, int i10) {
        this.f42551a = i10;
        this.f42552b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42551a) {
            case 0:
                this.f42552b.d();
                return;
            case 1:
                this.f42552b.a();
                return;
            default:
                y00 y00Var = this.f42552b;
                y00Var.b(y00Var.f42963y);
                return;
        }
    }
}
