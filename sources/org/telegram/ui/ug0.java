package org.telegram.ui;
public final class ug0 implements Runnable {
    public final int f50428a;
    public final ah0 f50429b;

    public ug0(ah0 ah0Var, int i7) {
        this.f50428a = i7;
        this.f50429b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f50428a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f50429b.f43651i1);
                return;
            default:
                org.telegram.messenger.g0.K3(this.f50429b.f43652j1.getEditText());
                return;
        }
    }
}
