package org.telegram.ui;
public final class u00 implements Runnable {
    public final int f37829a;
    public final v00 f37830b;

    public u00(v00 v00Var, int i10) {
        this.f37829a = i10;
        this.f37830b = v00Var;
    }

    @Override
    public final void run() {
        switch (this.f37829a) {
            case 0:
                this.f37830b.d();
                return;
            case 1:
                this.f37830b.a();
                return;
            default:
                v00 v00Var = this.f37830b;
                v00Var.b(v00Var.f38254y);
                return;
        }
    }
}
