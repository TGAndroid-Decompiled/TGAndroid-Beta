package org.telegram.ui;
public final class rj0 implements Runnable {
    public final int f39814a;
    public final xj0 f39815b;

    public rj0(xj0 xj0Var, int i10) {
        this.f39814a = i10;
        this.f39815b = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39814a) {
            case 0:
                this.f39815b.dismiss();
                return;
            case 1:
                this.f39815b.V(true, false);
                return;
            default:
                this.f39815b.V(true, false);
                return;
        }
    }
}
