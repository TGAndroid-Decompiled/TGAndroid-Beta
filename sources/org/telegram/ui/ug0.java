package org.telegram.ui;
public final class ug0 implements Runnable {
    public final int f50351a;
    public final ah0 f50352b;

    public ug0(ah0 ah0Var, int i7) {
        this.f50351a = i7;
        this.f50352b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f50351a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f50352b.f43657i1);
                return;
            default:
                org.telegram.messenger.g0.K3(this.f50352b.f43658j1.getEditText());
                return;
        }
    }
}
