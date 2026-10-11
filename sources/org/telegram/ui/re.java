package org.telegram.ui;
public final class re implements Runnable {
    public final int f41454a;
    public final org.telegram.ui.Components.hn0 f41455b;

    public re(org.telegram.ui.Components.hn0 hn0Var, int i10) {
        this.f41454a = i10;
        this.f41455b = hn0Var;
    }

    @Override
    public final void run() {
        switch (this.f41454a) {
            case 0:
                org.telegram.ui.Components.hn0 hn0Var = this.f41455b;
                if (!hn0Var.M) {
                    hn0Var.M = true;
                    hn0Var.c(new org.telegram.ui.Components.fn0(hn0Var, 0), false);
                    hn0Var.f27182s.invalidate();
                    return;
                }
                return;
            default:
                this.f41455b.dismiss();
                return;
        }
    }
}
