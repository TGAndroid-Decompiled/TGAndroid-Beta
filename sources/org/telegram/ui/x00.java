package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f39279a;
    public final y00 f39280b;

    public x00(y00 y00Var, int i10) {
        this.f39279a = i10;
        this.f39280b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f39279a) {
            case 0:
                this.f39280b.d();
                return;
            case 1:
                this.f39280b.a();
                return;
            default:
                y00 y00Var = this.f39280b;
                y00Var.b(y00Var.f39768y);
                return;
        }
    }
}
