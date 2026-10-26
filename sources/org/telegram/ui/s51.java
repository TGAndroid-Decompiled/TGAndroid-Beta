package org.telegram.ui;
public final class s51 implements Runnable {
    public final int f43367a;
    public final t51 f43368b;

    public s51(t51 t51Var, int i10) {
        this.f43367a = i10;
        this.f43368b = t51Var;
    }

    @Override
    public final void run() {
        switch (this.f43367a) {
            case 0:
                t51.a(this.f43368b);
                return;
            default:
                this.f43368b.dismiss();
                return;
        }
    }
}
