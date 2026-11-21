package org.telegram.ui;
public final class zg0 implements Runnable {
    public final int f54552a;
    public final fh0 f54553b;

    public zg0(fh0 fh0Var, int i7) {
        this.f54552a = i7;
        this.f54553b = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f54552a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f54553b.f47725m1);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f54553b.n1.getEditText());
                return;
        }
    }
}
