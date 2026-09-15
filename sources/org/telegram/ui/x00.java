package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f39425a;
    public final y00 f39426b;

    public x00(y00 y00Var, int i10) {
        this.f39425a = i10;
        this.f39426b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f39425a) {
            case 0:
                this.f39426b.d();
                return;
            case 1:
                this.f39426b.a();
                return;
            default:
                y00 y00Var = this.f39426b;
                y00Var.b(y00Var.f39715y);
                return;
        }
    }
}
