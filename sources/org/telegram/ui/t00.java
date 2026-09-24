package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f37885a;
    public final u00 f37886b;

    public t00(u00 u00Var, int i10) {
        this.f37885a = i10;
        this.f37886b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f37885a) {
            case 0:
                this.f37886b.d();
                return;
            case 1:
                this.f37886b.a();
                return;
            default:
                u00 u00Var = this.f37886b;
                u00Var.b(u00Var.f38255y);
                return;
        }
    }
}
