package org.telegram.ui;
public final class ye implements Runnable {
    public final int f41811a;
    public final org.telegram.ui.Components.cn0 f41812b;

    public ye(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f41811a = i10;
        this.f41812b = cn0Var;
    }

    @Override
    public final void run() {
        switch (this.f41811a) {
            case 0:
                org.telegram.ui.Components.cn0 cn0Var = this.f41812b;
                if (!cn0Var.M) {
                    cn0Var.M = true;
                    cn0Var.c(new org.telegram.ui.Components.an0(cn0Var, 0), false);
                    cn0Var.f23833s.invalidate();
                    return;
                }
                return;
            default:
                this.f41812b.dismiss();
                return;
        }
    }
}
