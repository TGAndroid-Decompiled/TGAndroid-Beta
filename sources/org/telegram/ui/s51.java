package org.telegram.ui;
public final class s51 implements Runnable {
    public final int f43364a;
    public final t51 f43365b;

    public s51(t51 t51Var, int i10) {
        this.f43364a = i10;
        this.f43365b = t51Var;
    }

    @Override
    public final void run() {
        switch (this.f43364a) {
            case 0:
                t51.a(this.f43365b);
                return;
            default:
                this.f43365b.dismiss();
                return;
        }
    }
}
