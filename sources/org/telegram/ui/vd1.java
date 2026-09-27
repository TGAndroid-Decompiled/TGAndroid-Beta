package org.telegram.ui;
public final class vd1 implements Runnable {
    public final int f38556a;
    public final ee1 f38557b;

    public vd1(ee1 ee1Var, int i10) {
        this.f38556a = i10;
        this.f38557b = ee1Var;
    }

    @Override
    public final void run() {
        switch (this.f38556a) {
            case 0:
                this.f38557b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f38557b.c(false);
                return;
        }
    }
}
