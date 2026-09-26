package org.telegram.ui;
public final class t00 implements Runnable {
    public final int f37901a;
    public final u00 f37902b;

    public t00(u00 u00Var, int i10) {
        this.f37901a = i10;
        this.f37902b = u00Var;
    }

    @Override
    public final void run() {
        switch (this.f37901a) {
            case 0:
                this.f37902b.d();
                return;
            case 1:
                this.f37902b.a();
                return;
            default:
                u00 u00Var = this.f37902b;
                u00Var.b(u00Var.f38273y);
                return;
        }
    }
}
