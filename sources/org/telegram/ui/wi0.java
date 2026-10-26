package org.telegram.ui;
public final class wi0 implements Runnable {
    public final int f45501a;
    public final cj0 f45502b;

    public wi0(cj0 cj0Var, int i10) {
        this.f45501a = i10;
        this.f45502b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f45501a) {
            case 0:
                this.f45502b.dismiss();
                return;
            case 1:
                this.f45502b.U(true, false);
                return;
            default:
                this.f45502b.U(true, false);
                return;
        }
    }
}
