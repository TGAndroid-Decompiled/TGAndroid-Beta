package org.telegram.ui;
public final class yc1 implements Runnable {
    public final int f46027a;
    public final id1 f46028b;

    public yc1(id1 id1Var, int i10) {
        this.f46027a = i10;
        this.f46028b = id1Var;
    }

    @Override
    public final void run() {
        switch (this.f46027a) {
            case 0:
                this.f46028b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f46028b.c(false);
                return;
        }
    }
}
