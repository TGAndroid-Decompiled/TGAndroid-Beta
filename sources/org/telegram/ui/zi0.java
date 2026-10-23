package org.telegram.ui;
public final class zi0 implements Runnable {
    public final int f44162a;
    public final fj0 f44163b;

    public zi0(fj0 fj0Var, int i10) {
        this.f44162a = i10;
        this.f44163b = fj0Var;
    }

    @Override
    public final void run() {
        switch (this.f44162a) {
            case 0:
                this.f44163b.dismiss();
                return;
            case 1:
                this.f44163b.U(true, false);
                return;
            default:
                this.f44163b.U(true, false);
                return;
        }
    }
}
