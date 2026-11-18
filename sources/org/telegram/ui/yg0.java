package org.telegram.ui;
public final class yg0 implements Runnable {
    public final int f54202a;
    public final eh0 f54203b;

    public yg0(eh0 eh0Var, int i7) {
        this.f54202a = i7;
        this.f54203b = eh0Var;
    }

    @Override
    public final void run() {
        switch (this.f54202a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f54203b.f47262m1);
                return;
            default:
                org.telegram.messenger.g0.I3(this.f54203b.n1.getEditText());
                return;
        }
    }
}
