package org.telegram.ui;
public final class v51 implements Runnable {
    public final int f44189a;
    public final w51 f44190b;

    public v51(w51 w51Var, int i10) {
        this.f44189a = i10;
        this.f44190b = w51Var;
    }

    @Override
    public final void run() {
        switch (this.f44189a) {
            case 0:
                w51.a(this.f44190b);
                return;
            default:
                this.f44190b.dismiss();
                return;
        }
    }
}
