package org.telegram.ui;
public final class z00 implements Runnable {
    public final int f40068a;
    public final a10 f40069b;

    public z00(a10 a10Var, int i10) {
        this.f40068a = i10;
        this.f40069b = a10Var;
    }

    @Override
    public final void run() {
        switch (this.f40068a) {
            case 0:
                this.f40069b.d();
                return;
            case 1:
                this.f40069b.a();
                return;
            default:
                a10 a10Var = this.f40069b;
                a10Var.b(a10Var.f31677y);
                return;
        }
    }
}
