package org.telegram.ui;
public final class xd1 implements Runnable {
    public final int f42842a;
    public final ge1 f42843b;

    public xd1(ge1 ge1Var, int i10) {
        this.f42842a = i10;
        this.f42843b = ge1Var;
    }

    @Override
    public final void run() {
        switch (this.f42842a) {
            case 0:
                this.f42843b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f42843b.c(false);
                return;
        }
    }
}
