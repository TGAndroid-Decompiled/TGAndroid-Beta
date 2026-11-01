package org.telegram.ui;
public final class yh0 implements Runnable {
    public final int f43668a;
    public final ei0 f43669b;

    public yh0(ei0 ei0Var, int i10) {
        this.f43668a = i10;
        this.f43669b = ei0Var;
    }

    @Override
    public final void run() {
        switch (this.f43668a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f43669b.f36836i1);
                return;
            default:
                org.telegram.messenger.i0.J3(this.f43669b.f36837j1.getEditText());
                return;
        }
    }
}
