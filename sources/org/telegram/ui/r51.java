package org.telegram.ui;
public final class r51 implements Runnable {
    public final int f42272a;
    public final s51 f42273b;

    public r51(s51 s51Var, int i9) {
        this.f42272a = i9;
        this.f42273b = s51Var;
    }

    @Override
    public final void run() {
        switch (this.f42272a) {
            case 0:
                s51.a(this.f42273b);
                return;
            default:
                this.f42273b.dismiss();
                return;
        }
    }
}
