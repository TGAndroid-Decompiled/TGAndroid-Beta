package org.telegram.ui;
public final class zg0 implements Runnable {
    public final int f54556a;
    public final fh0 f54557b;

    public zg0(fh0 fh0Var, int i7) {
        this.f54556a = i7;
        this.f54557b = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f54556a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f54557b.f47729m1);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f54557b.n1.getEditText());
                return;
        }
    }
}
