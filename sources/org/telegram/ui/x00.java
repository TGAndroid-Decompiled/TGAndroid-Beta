package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42670a;
    public final y00 f42671b;

    public x00(y00 y00Var, int i10) {
        this.f42670a = i10;
        this.f42671b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42670a) {
            case 0:
                this.f42671b.d();
                return;
            case 1:
                this.f42671b.a();
                return;
            default:
                y00 y00Var = this.f42671b;
                y00Var.b(y00Var.f42986y);
                return;
        }
    }
}
