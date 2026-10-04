package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42678a;
    public final y00 f42679b;

    public x00(y00 y00Var, int i10) {
        this.f42678a = i10;
        this.f42679b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42678a) {
            case 0:
                this.f42679b.d();
                return;
            case 1:
                this.f42679b.a();
                return;
            default:
                y00 y00Var = this.f42679b;
                y00Var.b(y00Var.f42994y);
                return;
        }
    }
}
