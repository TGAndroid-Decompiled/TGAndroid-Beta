package org.telegram.ui;
public final class ug0 implements Runnable {
    public final int f51942a;
    public final bh0 f51943b;

    public ug0(bh0 bh0Var, int i7) {
        this.f51942a = i7;
        this.f51943b = bh0Var;
    }

    @Override
    public final void run() {
        switch (this.f51942a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f51943b.f45750m1);
                return;
            default:
                org.telegram.messenger.g0.J3(this.f51943b.n1.getEditText());
                return;
        }
    }
}
