package org.telegram.ui;
public final class sy implements Runnable {
    public final int f52102a;
    public final hi.m3 f52103b;

    public sy(hi.m3 m3Var, int i7) {
        this.f52102a = i7;
        this.f52103b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f52102a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f52103b);
                return;
            default:
                this.f52103b.f(true);
                return;
        }
    }
}
