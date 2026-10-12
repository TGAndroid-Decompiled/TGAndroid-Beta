package org.telegram.ui;
public final class zb0 implements Runnable {
    public final int f44706a;
    public final fc0 f44707b;

    public zb0(fc0 fc0Var, int i10) {
        this.f44706a = i10;
        this.f44707b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44706a) {
            case 0:
                this.f44707b.b();
                return;
            default:
                this.f44707b.c();
                return;
        }
    }
}
