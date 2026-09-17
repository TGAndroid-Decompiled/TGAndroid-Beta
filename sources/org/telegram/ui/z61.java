package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f43325a;
    public final a71 f43326b;

    public z61(a71 a71Var, int i10) {
        this.f43325a = i10;
        this.f43326b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f43325a) {
            case 0:
                a71.a(this.f43326b);
                return;
            default:
                this.f43326b.dismiss();
                return;
        }
    }
}
