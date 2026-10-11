package org.telegram.ui;
public final class w00 implements Runnable {
    public final int f43163a;
    public final x00 f43164b;

    public w00(x00 x00Var, int i10) {
        this.f43163a = i10;
        this.f43164b = x00Var;
    }

    @Override
    public final void run() {
        switch (this.f43163a) {
            case 0:
                this.f43164b.d();
                return;
            case 1:
                this.f43164b.a();
                return;
            default:
                x00 x00Var = this.f43164b;
                x00Var.b(x00Var.f43914y);
                return;
        }
    }
}
