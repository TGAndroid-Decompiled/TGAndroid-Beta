package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f43324a;
    public final a71 f43325b;

    public z61(a71 a71Var, int i10) {
        this.f43324a = i10;
        this.f43325b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f43324a) {
            case 0:
                a71.a(this.f43325b);
                return;
            default:
                this.f43325b.dismiss();
                return;
        }
    }
}
