package org.telegram.ui;
public final class ud1 implements Runnable {
    public final int f38419a;
    public final de1 f38420b;

    public ud1(de1 de1Var, int i10) {
        this.f38419a = i10;
        this.f38420b = de1Var;
    }

    @Override
    public final void run() {
        switch (this.f38419a) {
            case 0:
                this.f38420b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f38420b.c(false);
                return;
        }
    }
}
