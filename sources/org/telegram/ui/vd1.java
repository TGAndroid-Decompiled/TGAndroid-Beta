package org.telegram.ui;
public final class vd1 implements Runnable {
    public final int f41719a;
    public final ee1 f41720b;

    public vd1(ee1 ee1Var, int i10) {
        this.f41719a = i10;
        this.f41720b = ee1Var;
    }

    @Override
    public final void run() {
        switch (this.f41719a) {
            case 0:
                this.f41720b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f41720b.c(false);
                return;
        }
    }
}
