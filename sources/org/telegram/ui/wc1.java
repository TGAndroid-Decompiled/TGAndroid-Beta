package org.telegram.ui;
public final class wc1 implements Runnable {
    public final int f43943a;
    public final fd1 f43944b;

    public wc1(fd1 fd1Var, int i10) {
        this.f43943a = i10;
        this.f43944b = fd1Var;
    }

    @Override
    public final void run() {
        switch (this.f43943a) {
            case 0:
                this.f43944b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f43944b.c(false);
                return;
        }
    }
}
