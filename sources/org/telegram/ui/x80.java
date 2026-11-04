package org.telegram.ui;
public final class x80 implements Runnable {
    public final int f51887a;
    public final e90 f51888b;

    public x80(e90 e90Var, int i3) {
        this.f51887a = i3;
        this.f51888b = e90Var;
    }

    @Override
    public final void run() {
        int i3 = this.f51887a;
        e90 e90Var = this.f51888b;
        switch (i3) {
            case 0:
                sf.c.t(e90Var.getParentActivity(), org.telegram.messenger.bd.M0(2131746166, null));
                return;
            case 1:
                e90Var.f44936r.d.requestFocus();
                org.telegram.messenger.g0.K3(e90Var.f44936r.d);
                return;
            default:
                e90Var.f44936r.d.clearFocus();
                org.telegram.messenger.g0.v1(e90Var.f44936r.d);
                return;
        }
    }
}
