package org.telegram.ui;
public final class rh0 implements Runnable {
    public final int f41091a;
    public final uh0 f41092b;

    public rh0(uh0 uh0Var, int i10) {
        this.f41091a = i10;
        this.f41092b = uh0Var;
    }

    @Override
    public final void run() {
        switch (this.f41091a) {
            case 0:
                this.f41092b.dismiss();
                return;
            case 1:
                this.f41092b.g1(true, false);
                return;
            default:
                this.f41092b.g1(true, false);
                return;
        }
    }
}
