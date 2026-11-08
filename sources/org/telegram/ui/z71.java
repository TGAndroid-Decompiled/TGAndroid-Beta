package org.telegram.ui;
public final class z71 implements Runnable {
    public final int f52478a;
    public final g81 f52479b;

    public z71(g81 g81Var, int i7) {
        this.f52478a = i7;
        this.f52479b = g81Var;
    }

    @Override
    public final void run() {
        switch (this.f52478a) {
            case 0:
                this.f52479b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f52479b.c(false);
                return;
        }
    }
}
