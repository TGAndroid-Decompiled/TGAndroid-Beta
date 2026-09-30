package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f38010a;
    public final u00 f38011b;

    public t00(u00 u00Var, int i10) {
        this.f38010a = i10;
        this.f38011b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f38010a) {
            case 0:
                this.f38011b.d();
                return;
            case 1:
                this.f38011b.a();
                return;
            default:
                u00 u00Var = this.f38011b;
                u00Var.b(u00Var.f38364y);
                return;
        }
    }
}
