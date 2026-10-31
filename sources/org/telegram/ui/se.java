package org.telegram.ui;
public final class se implements Runnable {
    public final int f41482a;
    public final org.telegram.ui.Components.nl0 f41483b;

    public se(org.telegram.ui.Components.nl0 nl0Var, int i10) {
        this.f41482a = i10;
        this.f41483b = nl0Var;
    }

    @Override
    public final void run() {
        switch (this.f41482a) {
            case 0:
                org.telegram.ui.Components.nl0 nl0Var = this.f41483b;
                if (!nl0Var.M) {
                    nl0Var.M = true;
                    nl0Var.c(new org.telegram.ui.Components.ll0(nl0Var, 0), false);
                    nl0Var.f28823s.invalidate();
                    return;
                }
                return;
            default:
                this.f41483b.dismiss();
                return;
        }
    }
}
