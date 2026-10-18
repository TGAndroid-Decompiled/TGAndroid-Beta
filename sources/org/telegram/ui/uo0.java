package org.telegram.ui;
public final class uo0 implements Runnable {
    public final int f41995a;
    public final ep0 f41996b;

    public uo0(ep0 ep0Var, int i10) {
        this.f41995a = i10;
        this.f41996b = ep0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41995a;
        ep0 ep0Var = this.f41996b;
        switch (i10) {
            case 0:
                if (ep0Var.G) {
                    ep0Var.f36566b.invalidate();
                    return;
                }
                return;
            case 1:
                ep0Var.h();
                return;
            case 2:
                int i11 = ep0.f36563q0;
                ep0Var.h();
                return;
            default:
                int i12 = ep0.f36563q0;
                ep0Var.h();
                return;
        }
    }
}
