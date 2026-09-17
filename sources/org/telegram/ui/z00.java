package org.telegram.ui;
public final class z00 implements Runnable {
    public final int f40063a;
    public final a10 f40064b;

    public z00(a10 a10Var, int i10) {
        this.f40063a = i10;
        this.f40064b = a10Var;
    }

    @Override
    public final void run() {
        switch (this.f40063a) {
            case 0:
                this.f40064b.d();
                return;
            case 1:
                this.f40064b.a();
                return;
            default:
                a10 a10Var = this.f40064b;
                a10Var.b(a10Var.f31673y);
                return;
        }
    }
}
