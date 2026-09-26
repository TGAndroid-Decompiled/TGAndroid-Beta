package org.telegram.ui;
public final class ud1 implements Runnable {
    public final int f38437a;
    public final de1 f38438b;

    public ud1(de1 de1Var, int i10) {
        this.f38437a = i10;
        this.f38438b = de1Var;
    }

    @Override
    public final void run() {
        switch (this.f38437a) {
            case 0:
                this.f38438b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f38438b.c(false);
                return;
        }
    }
}
