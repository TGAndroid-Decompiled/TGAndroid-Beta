package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f38467a;
    public final u00 f38468b;

    public t00(u00 u00Var, int i10) {
        this.f38467a = i10;
        this.f38468b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f38467a) {
            case 0:
                this.f38468b.d();
                return;
            case 1:
                this.f38468b.a();
                return;
            default:
                u00 u00Var = this.f38468b;
                u00Var.b(u00Var.f38798y);
                return;
        }
    }
}
