package org.telegram.ui;
public final class ug0 implements Runnable {
    public final int f50407a;
    public final ah0 f50408b;

    public ug0(ah0 ah0Var, int i7) {
        this.f50407a = i7;
        this.f50408b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f50407a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f50408b.f43627i1);
                return;
            default:
                org.telegram.messenger.g0.K3(this.f50408b.f43628j1.getEditText());
                return;
        }
    }
}
