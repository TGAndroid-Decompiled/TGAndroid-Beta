package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f42745a;
    public final y00 f42746b;

    public x00(y00 y00Var, int i10) {
        this.f42745a = i10;
        this.f42746b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f42745a) {
            case 0:
                this.f42746b.d();
                return;
            case 1:
                this.f42746b.a();
                return;
            default:
                y00 y00Var = this.f42746b;
                y00Var.b(y00Var.f43056y);
                return;
        }
    }
}
