package org.telegram.ui;
public final class se implements Runnable {
    public final int f40464a;
    public final org.telegram.ui.Components.sm0 f40465b;

    public se(org.telegram.ui.Components.sm0 sm0Var, int i10) {
        this.f40464a = i10;
        this.f40465b = sm0Var;
    }

    @Override
    public final void run() {
        switch (this.f40464a) {
            case 0:
                org.telegram.ui.Components.sm0 sm0Var = this.f40465b;
                if (!sm0Var.M) {
                    sm0Var.M = true;
                    sm0Var.c(new org.telegram.ui.Components.qm0(sm0Var, 0), false);
                    sm0Var.f30824s.invalidate();
                    return;
                }
                return;
            default:
                this.f40465b.dismiss();
                return;
        }
    }
}
