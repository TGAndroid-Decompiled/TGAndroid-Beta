package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f43779a;
    public final y00 f43780b;

    public x00(y00 y00Var, int i10) {
        this.f43779a = i10;
        this.f43780b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f43779a) {
            case 0:
                this.f43780b.d();
                return;
            case 1:
                this.f43780b.a();
                return;
            default:
                y00 y00Var = this.f43780b;
                y00Var.b(y00Var.f44187y);
                return;
        }
    }
}
