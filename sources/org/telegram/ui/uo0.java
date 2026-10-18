package org.telegram.ui;
public final class uo0 implements Runnable {
    public final int f42037a;
    public final ep0 f42038b;

    public uo0(ep0 ep0Var, int i10) {
        this.f42037a = i10;
        this.f42038b = ep0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42037a;
        ep0 ep0Var = this.f42038b;
        switch (i10) {
            case 0:
                if (ep0Var.G) {
                    ep0Var.f36582b.invalidate();
                    return;
                }
                return;
            case 1:
                ep0Var.h();
                return;
            case 2:
                int i11 = ep0.f36579q0;
                ep0Var.h();
                return;
            default:
                int i12 = ep0.f36579q0;
                ep0Var.h();
                return;
        }
    }
}
