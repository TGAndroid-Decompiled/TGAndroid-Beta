package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f41348a;
    public final u00 f41349b;

    public t00(u00 u00Var, int i10) {
        this.f41348a = i10;
        this.f41349b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f41348a) {
            case 0:
                this.f41349b.d();
                return;
            case 1:
                this.f41349b.a();
                return;
            default:
                u00 u00Var = this.f41349b;
                u00Var.b(u00Var.f41680y);
                return;
        }
    }
}
