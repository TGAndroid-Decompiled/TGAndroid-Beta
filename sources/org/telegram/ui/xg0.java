package org.telegram.ui;
public final class xg0 implements Runnable {
    public final int f53967a;
    public final dh0 f53968b;

    public xg0(dh0 dh0Var, int i7) {
        this.f53967a = i7;
        this.f53968b = dh0Var;
    }

    @Override
    public final void run() {
        switch (this.f53967a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f53968b.f47129m1);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f53968b.n1.getEditText());
                return;
        }
    }
}
