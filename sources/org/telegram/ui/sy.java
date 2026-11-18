package org.telegram.ui;
public final class sy implements Runnable {
    public final int f52104a;
    public final hi.m3 f52105b;

    public sy(hi.m3 m3Var, int i7) {
        this.f52104a = i7;
        this.f52105b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f52104a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f52105b);
                return;
            default:
                this.f52105b.f(true);
                return;
        }
    }
}
