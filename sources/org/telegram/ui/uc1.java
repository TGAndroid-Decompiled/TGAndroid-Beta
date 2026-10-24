package org.telegram.ui;
public final class uc1 implements Runnable {
    public final int f42387a;
    public final dd1 f42388b;

    public uc1(dd1 dd1Var, int i10) {
        this.f42387a = i10;
        this.f42388b = dd1Var;
    }

    @Override
    public final void run() {
        switch (this.f42387a) {
            case 0:
                this.f42388b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f42388b.c(false);
                return;
        }
    }
}
