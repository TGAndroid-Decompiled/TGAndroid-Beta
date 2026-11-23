package org.telegram.ui;
public final class z71 implements Runnable {
    public final int f54545a;
    public final g81 f54546b;

    public z71(g81 g81Var, int i7) {
        this.f54545a = i7;
        this.f54546b = g81Var;
    }

    @Override
    public final void run() {
        switch (this.f54545a) {
            case 0:
                this.f54546b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f54546b.c(false);
                return;
        }
    }
}
