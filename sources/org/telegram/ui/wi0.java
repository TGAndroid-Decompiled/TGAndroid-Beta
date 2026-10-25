package org.telegram.ui;
public final class wi0 implements Runnable {
    public final int f45498a;
    public final cj0 f45499b;

    public wi0(cj0 cj0Var, int i10) {
        this.f45498a = i10;
        this.f45499b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f45498a) {
            case 0:
                this.f45499b.dismiss();
                return;
            case 1:
                this.f45499b.U(true, false);
                return;
            default:
                this.f45499b.U(true, false);
                return;
        }
    }
}
