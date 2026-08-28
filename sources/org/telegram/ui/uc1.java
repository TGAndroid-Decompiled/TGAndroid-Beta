package org.telegram.ui;
public final class uc1 implements Runnable {
    public final int f43218a;
    public final dd1 f43219b;

    public uc1(dd1 dd1Var, int i9) {
        this.f43218a = i9;
        this.f43219b = dd1Var;
    }

    @Override
    public final void run() {
        switch (this.f43218a) {
            case 0:
                this.f43219b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f43219b.c(false);
                return;
        }
    }
}
