package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f37902a;
    public final u00 f37903b;

    public t00(u00 u00Var, int i10) {
        this.f37902a = i10;
        this.f37903b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f37902a) {
            case 0:
                this.f37903b.d();
                return;
            case 1:
                this.f37903b.a();
                return;
            default:
                u00 u00Var = this.f37903b;
                u00Var.b(u00Var.f38274y);
                return;
        }
    }
}
