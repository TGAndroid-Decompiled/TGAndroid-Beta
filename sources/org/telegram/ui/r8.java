package org.telegram.ui;
public final class r8 implements Runnable {
    public final int f43049a;
    public final o9 f43050b;

    public r8(o9 o9Var, int i10) {
        this.f43049a = i10;
        this.f43050b = o9Var;
    }

    @Override
    public final void run() {
        switch (this.f43049a) {
            case 0:
                this.f43050b.h0(false);
                return;
            default:
                this.f43050b.d0();
                return;
        }
    }
}
