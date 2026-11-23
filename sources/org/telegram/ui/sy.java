package org.telegram.ui;
public final class sy implements Runnable {
    public final int f52156a;
    public final hi.l3 f52157b;

    public sy(hi.l3 l3Var, int i7) {
        this.f52156a = i7;
        this.f52157b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f52156a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f52157b);
                return;
            default:
                this.f52157b.f(true);
                return;
        }
    }
}
