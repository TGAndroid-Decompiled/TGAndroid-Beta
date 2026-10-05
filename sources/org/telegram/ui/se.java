package org.telegram.ui;
public final class se implements Runnable {
    public final int f40450a;
    public final org.telegram.ui.Components.sm0 f40451b;

    public se(org.telegram.ui.Components.sm0 sm0Var, int i10) {
        this.f40450a = i10;
        this.f40451b = sm0Var;
    }

    @Override
    public final void run() {
        switch (this.f40450a) {
            case 0:
                org.telegram.ui.Components.sm0 sm0Var = this.f40451b;
                if (!sm0Var.M) {
                    sm0Var.M = true;
                    sm0Var.c(new org.telegram.ui.Components.qm0(sm0Var, 0), false);
                    sm0Var.f30886s.invalidate();
                    return;
                }
                return;
            default:
                this.f40451b.dismiss();
                return;
        }
    }
}
