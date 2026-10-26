package org.telegram.ui;
public final class yc1 implements Runnable {
    public final int f46030a;
    public final id1 f46031b;

    public yc1(id1 id1Var, int i10) {
        this.f46030a = i10;
        this.f46031b = id1Var;
    }

    @Override
    public final void run() {
        switch (this.f46030a) {
            case 0:
                this.f46031b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f46031b.c(false);
                return;
        }
    }
}
