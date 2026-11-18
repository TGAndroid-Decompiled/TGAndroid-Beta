package org.telegram.ui;
public final class zg0 implements Runnable {
    public final int f54505a;
    public final fh0 f54506b;

    public zg0(fh0 fh0Var, int i7) {
        this.f54505a = i7;
        this.f54506b = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f54505a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f54506b.f47658m1);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f54506b.n1.getEditText());
                return;
        }
    }
}
