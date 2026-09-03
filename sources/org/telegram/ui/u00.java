package org.telegram.ui;
public final class u00 implements Runnable {
    public final int f38630a;
    public final v00 f38631b;

    public u00(v00 v00Var, int i10) {
        this.f38630a = i10;
        this.f38631b = v00Var;
    }

    @Override
    public final void run() {
        switch (this.f38630a) {
            case 0:
                this.f38631b.d();
                return;
            case 1:
                this.f38631b.a();
                return;
            default:
                v00 v00Var = this.f38631b;
                v00Var.b(v00Var.f38946y);
                return;
        }
    }
}
