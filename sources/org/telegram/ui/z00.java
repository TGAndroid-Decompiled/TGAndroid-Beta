package org.telegram.ui;
public final class z00 implements Runnable {
    public final int f44582a;
    public final a10 f44583b;

    public z00(a10 a10Var, int i10) {
        this.f44582a = i10;
        this.f44583b = a10Var;
    }

    @Override
    public final void run() {
        switch (this.f44582a) {
            case 0:
                this.f44583b.d();
                return;
            case 1:
                this.f44583b.a();
                return;
            default:
                a10 a10Var = this.f44583b;
                a10Var.b(a10Var.f35662y);
                return;
        }
    }
}
