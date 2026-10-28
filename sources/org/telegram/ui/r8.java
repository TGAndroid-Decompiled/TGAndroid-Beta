package org.telegram.ui;
public final class r8 implements Runnable {
    public final int f42882a;
    public final o9 f42883b;

    public r8(o9 o9Var, int i10) {
        this.f42882a = i10;
        this.f42883b = o9Var;
    }

    @Override
    public final void run() {
        switch (this.f42882a) {
            case 0:
                this.f42883b.h0(false);
                return;
            default:
                this.f42883b.d0();
                return;
        }
    }
}
