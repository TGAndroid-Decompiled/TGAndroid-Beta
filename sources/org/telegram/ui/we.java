package org.telegram.ui;
public final class we implements Runnable {
    public final int f43144a;
    public final org.telegram.ui.Components.mn0 f43145b;

    public we(org.telegram.ui.Components.mn0 mn0Var, int i10) {
        this.f43144a = i10;
        this.f43145b = mn0Var;
    }

    @Override
    public final void run() {
        switch (this.f43144a) {
            case 0:
                org.telegram.ui.Components.mn0 mn0Var = this.f43145b;
                if (!mn0Var.M) {
                    mn0Var.M = true;
                    mn0Var.c(new org.telegram.ui.Components.kn0(mn0Var, 0), false);
                    mn0Var.f28601s.invalidate();
                    return;
                }
                return;
            default:
                this.f43145b.dismiss();
                return;
        }
    }
}
