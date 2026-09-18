package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f39289a;
    public final y00 f39290b;

    public x00(y00 y00Var, int i10) {
        this.f39289a = i10;
        this.f39290b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f39289a) {
            case 0:
                this.f39290b.d();
                return;
            case 1:
                this.f39290b.a();
                return;
            default:
                y00 y00Var = this.f39290b;
                y00Var.b(y00Var.f39663y);
                return;
        }
    }
}
