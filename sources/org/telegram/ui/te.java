package org.telegram.ui;
public final class te implements Runnable {
    public final int f37763a;
    public final org.telegram.ui.Components.om0 f37764b;

    public te(org.telegram.ui.Components.om0 om0Var, int i10) {
        this.f37763a = i10;
        this.f37764b = om0Var;
    }

    @Override
    public final void run() {
        switch (this.f37763a) {
            case 0:
                org.telegram.ui.Components.om0 om0Var = this.f37764b;
                if (!om0Var.M) {
                    om0Var.M = true;
                    om0Var.c(new org.telegram.ui.Components.mm0(om0Var, 0), false);
                    om0Var.f27146s.invalidate();
                    return;
                }
                return;
            default:
                this.f37764b.dismiss();
                return;
        }
    }
}
