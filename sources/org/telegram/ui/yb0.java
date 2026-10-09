package org.telegram.ui;
public final class yb0 implements Runnable {
    public final int f44309a;
    public final ec0 f44310b;

    public yb0(ec0 ec0Var, int i10) {
        this.f44309a = i10;
        this.f44310b = ec0Var;
    }

    @Override
    public final void run() {
        switch (this.f44309a) {
            case 0:
                this.f44310b.b();
                return;
            default:
                this.f44310b.c();
                return;
        }
    }
}
