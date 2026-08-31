package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f41416a;
    public final u00 f41417b;

    public t00(u00 u00Var, int i10) {
        this.f41416a = i10;
        this.f41417b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f41416a) {
            case 0:
                this.f41417b.d();
                return;
            case 1:
                this.f41417b.a();
                return;
            default:
                u00 u00Var = this.f41417b;
                u00Var.b(u00Var.f41754y);
                return;
        }
    }
}
