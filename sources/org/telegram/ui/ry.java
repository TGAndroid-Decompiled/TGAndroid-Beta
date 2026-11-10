package org.telegram.ui;
public final class ry implements Runnable {
    public final int f49593a;
    public final fi.m3 f49594b;

    public ry(fi.m3 m3Var, int i7) {
        this.f49593a = i7;
        this.f49594b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f49593a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f49594b);
                return;
            default:
                this.f49594b.f(true);
                return;
        }
    }
}
