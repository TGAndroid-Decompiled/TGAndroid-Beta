package org.telegram.ui;
public final class zg0 implements Runnable {
    public final int f54519a;
    public final fh0 f54520b;

    public zg0(fh0 fh0Var, int i7) {
        this.f54519a = i7;
        this.f54520b = fh0Var;
    }

    @Override
    public final void run() {
        switch (this.f54519a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f54520b.f47697m1);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f54520b.n1.getEditText());
                return;
        }
    }
}
