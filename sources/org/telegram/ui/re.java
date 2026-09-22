package org.telegram.ui;
public final class re implements Runnable {
    public final int f37147a;
    public final org.telegram.ui.Components.om0 f37148b;

    public re(org.telegram.ui.Components.om0 om0Var, int i10) {
        this.f37147a = i10;
        this.f37148b = om0Var;
    }

    @Override
    public final void run() {
        switch (this.f37147a) {
            case 0:
                org.telegram.ui.Components.om0 om0Var = this.f37148b;
                if (!om0Var.M) {
                    om0Var.M = true;
                    om0Var.c(new org.telegram.ui.Components.mm0(om0Var, 0), false);
                    om0Var.f27153s.invalidate();
                    return;
                }
                return;
            default:
                this.f37148b.dismiss();
                return;
        }
    }
}
