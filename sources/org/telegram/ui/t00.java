package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f37903a;
    public final u00 f37904b;

    public t00(u00 u00Var, int i10) {
        this.f37903a = i10;
        this.f37904b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f37903a) {
            case 0:
                this.f37904b.d();
                return;
            case 1:
                this.f37904b.a();
                return;
            default:
                u00 u00Var = this.f37904b;
                u00Var.b(u00Var.f38275y);
                return;
        }
    }
}
