package org.telegram.ui;
public final class xd1 implements Runnable {
    public final int f42834a;
    public final ge1 f42835b;

    public xd1(ge1 ge1Var, int i10) {
        this.f42834a = i10;
        this.f42835b = ge1Var;
    }

    @Override
    public final void run() {
        switch (this.f42834a) {
            case 0:
                this.f42835b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f42835b.c(false);
                return;
        }
    }
}
