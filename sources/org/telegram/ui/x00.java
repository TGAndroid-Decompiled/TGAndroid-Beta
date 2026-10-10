package org.telegram.ui;
public final class x00 implements Runnable {
    public final int f43825a;
    public final y00 f43826b;

    public x00(y00 y00Var, int i10) {
        this.f43825a = i10;
        this.f43826b = y00Var;
    }

    @Override
    public final void run() {
        switch (this.f43825a) {
            case 0:
                this.f43826b.d();
                return;
            case 1:
                this.f43826b.a();
                return;
            default:
                y00 y00Var = this.f43826b;
                y00Var.b(y00Var.f44233y);
                return;
        }
    }
}
