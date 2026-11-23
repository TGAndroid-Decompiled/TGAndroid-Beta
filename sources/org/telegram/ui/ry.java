package org.telegram.ui;
public final class ry implements Runnable {
    public final int f51913a;
    public final hi.u3 f51914b;

    public ry(hi.u3 u3Var, int i7) {
        this.f51913a = i7;
        this.f51914b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f51913a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f51914b);
                return;
            default:
                this.f51914b.f(true);
                return;
        }
    }
}
