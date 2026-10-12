package org.telegram.ui;
public final class we implements Runnable {
    public final int f43142a;
    public final org.telegram.ui.Components.mn0 f43143b;

    public we(org.telegram.ui.Components.mn0 mn0Var, int i10) {
        this.f43142a = i10;
        this.f43143b = mn0Var;
    }

    @Override
    public final void run() {
        switch (this.f43142a) {
            case 0:
                org.telegram.ui.Components.mn0 mn0Var = this.f43143b;
                if (!mn0Var.M) {
                    mn0Var.M = true;
                    mn0Var.c(new org.telegram.ui.Components.kn0(mn0Var, 0), false);
                    mn0Var.f28611s.invalidate();
                    return;
                }
                return;
            default:
                this.f43143b.dismiss();
                return;
        }
    }
}
