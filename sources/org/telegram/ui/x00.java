package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f39419a;
    public final y00 f39420b;

    public x00(y00 y00Var, int i10) {
        this.f39419a = i10;
        this.f39420b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f39419a) {
            case 0:
                this.f39420b.d();
                return;
            case 1:
                this.f39420b.a();
                return;
            default:
                y00 y00Var = this.f39420b;
                y00Var.b(y00Var.f39727y);
                return;
        }
    }
}
