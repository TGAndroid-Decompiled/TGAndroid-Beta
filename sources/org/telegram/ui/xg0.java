package org.telegram.ui;
public final class xg0 implements Runnable {
    public final int f51723a;
    public final dh0 f51724b;

    public xg0(dh0 dh0Var, int i7) {
        this.f51723a = i7;
        this.f51724b = dh0Var;
    }

    @Override
    public final void run() {
        switch (this.f51723a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f51724b.l1);
                return;
            default:
                org.telegram.messenger.g0.K3(this.f51724b.f44983m1.getEditText());
                return;
        }
    }
}
