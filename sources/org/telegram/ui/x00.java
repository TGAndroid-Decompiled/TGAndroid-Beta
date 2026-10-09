package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f43781a;
    public final y00 f43782b;

    public x00(y00 y00Var, int i10) {
        this.f43781a = i10;
        this.f43782b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f43781a) {
            case 0:
                this.f43782b.d();
                return;
            case 1:
                this.f43782b.a();
                return;
            default:
                y00 y00Var = this.f43782b;
                y00Var.b(y00Var.f44189y);
                return;
        }
    }
}
