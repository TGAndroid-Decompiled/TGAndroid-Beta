package org.telegram.ui;
public final class yb0 implements Runnable {
    public final int f44353a;
    public final ec0 f44354b;

    public yb0(ec0 ec0Var, int i10) {
        this.f44353a = i10;
        this.f44354b = ec0Var;
    }

    @Override
    public final void run() {
        switch (this.f44353a) {
            case 0:
                this.f44354b.b();
                return;
            default:
                this.f44354b.c();
                return;
        }
    }
}
