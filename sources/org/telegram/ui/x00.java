package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42524a;
    public final y00 f42525b;

    public x00(y00 y00Var, int i10) {
        this.f42524a = i10;
        this.f42525b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42524a) {
            case 0:
                this.f42525b.d();
                return;
            case 1:
                this.f42525b.a();
                return;
            default:
                y00 y00Var = this.f42525b;
                y00Var.b(y00Var.f42936y);
                return;
        }
    }
}
