package org.telegram.ui;
public final class xd1 implements Runnable {
    public final int f42835a;
    public final ge1 f42836b;

    public xd1(ge1 ge1Var, int i10) {
        this.f42835a = i10;
        this.f42836b = ge1Var;
    }

    @Override
    public final void run() {
        switch (this.f42835a) {
            case 0:
                this.f42836b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f42836b.c(false);
                return;
        }
    }
}
