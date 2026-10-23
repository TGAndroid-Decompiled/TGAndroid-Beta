package org.telegram.ui;
public final class r51 implements Runnable {
    public final int f41029a;
    public final s51 f41030b;

    public r51(s51 s51Var, int i10) {
        this.f41029a = i10;
        this.f41030b = s51Var;
    }

    @Override
    public final void run() {
        switch (this.f41029a) {
            case 0:
                s51.a(this.f41030b);
                return;
            default:
                this.f41030b.dismiss();
                return;
        }
    }
}
