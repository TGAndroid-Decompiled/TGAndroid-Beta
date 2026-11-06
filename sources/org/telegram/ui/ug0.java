package org.telegram.ui;
public final class ug0 implements Runnable {
    public final int f50429a;
    public final ah0 f50430b;

    public ug0(ah0 ah0Var, int i7) {
        this.f50429a = i7;
        this.f50430b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f50429a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f50430b.f43652i1);
                return;
            default:
                org.telegram.messenger.g0.K3(this.f50430b.f43653j1.getEditText());
                return;
        }
    }
}
