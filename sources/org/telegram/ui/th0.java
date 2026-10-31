package org.telegram.ui;
public final class th0 implements Runnable {
    public final int f41844a;
    public final wh0 f41845b;

    public th0(wh0 wh0Var, int i10) {
        this.f41844a = i10;
        this.f41845b = wh0Var;
    }

    @Override
    public final void run() {
        switch (this.f41844a) {
            case 0:
                this.f41845b.dismiss();
                return;
            case 1:
                this.f41845b.g1(true, false);
                return;
            default:
                this.f41845b.g1(true, false);
                return;
        }
    }
}
