package org.telegram.ui;
public final class z61 implements Runnable {
    public final int f43351a;
    public final a71 f43352b;

    public z61(a71 a71Var, int i10) {
        this.f43351a = i10;
        this.f43352b = a71Var;
    }

    @Override
    public final void run() {
        switch (this.f43351a) {
            case 0:
                a71.a(this.f43352b);
                return;
            default:
                this.f43352b.dismiss();
                return;
        }
    }
}
