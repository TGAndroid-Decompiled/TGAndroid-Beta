package org.telegram.ui;
public final class r8 implements Runnable {
    public final int f43046a;
    public final o9 f43047b;

    public r8(o9 o9Var, int i10) {
        this.f43046a = i10;
        this.f43047b = o9Var;
    }

    @Override
    public final void run() {
        switch (this.f43046a) {
            case 0:
                this.f43047b.h0(false);
                return;
            default:
                this.f43047b.d0();
                return;
        }
    }
}
