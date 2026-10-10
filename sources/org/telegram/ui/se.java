package org.telegram.ui;
public final class se implements Runnable {
    public final int f41721a;
    public final org.telegram.ui.Components.hn0 f41722b;

    public se(org.telegram.ui.Components.hn0 hn0Var, int i10) {
        this.f41721a = i10;
        this.f41722b = hn0Var;
    }

    @Override
    public final void run() {
        switch (this.f41721a) {
            case 0:
                org.telegram.ui.Components.hn0 hn0Var = this.f41722b;
                if (!hn0Var.M) {
                    hn0Var.M = true;
                    hn0Var.c(new org.telegram.ui.Components.fn0(hn0Var, 0), false);
                    hn0Var.f27092s.invalidate();
                    return;
                }
                return;
            default:
                this.f41722b.dismiss();
                return;
        }
    }
}
