package org.telegram.ui;
public final class wg0 implements Runnable {
    public final int f51407a;
    public final ch0 f51408b;

    public wg0(ch0 ch0Var, int i7) {
        this.f51407a = i7;
        this.f51408b = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f51407a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f51408b.f44312i1);
                return;
            default:
                org.telegram.messenger.g0.K3(this.f51408b.f44313j1.getEditText());
                return;
        }
    }
}
