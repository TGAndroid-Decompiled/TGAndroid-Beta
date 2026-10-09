package org.telegram.ui;
public final class yb0 implements Runnable {
    public final int f44307a;
    public final ec0 f44308b;

    public yb0(ec0 ec0Var, int i10) {
        this.f44307a = i10;
        this.f44308b = ec0Var;
    }

    @Override
    public final void run() {
        switch (this.f44307a) {
            case 0:
                this.f44308b.b();
                return;
            default:
                this.f44308b.c();
                return;
        }
    }
}
