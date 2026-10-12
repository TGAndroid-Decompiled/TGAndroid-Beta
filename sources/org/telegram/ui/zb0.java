package org.telegram.ui;
public final class zb0 implements Runnable {
    public final int f44711a;
    public final fc0 f44712b;

    public zb0(fc0 fc0Var, int i10) {
        this.f44711a = i10;
        this.f44712b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44711a) {
            case 0:
                this.f44712b.b();
                return;
            default:
                this.f44712b.c();
                return;
        }
    }
}
