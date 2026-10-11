package org.telegram.ui;
public final class re implements Runnable {
    public final int f41420a;
    public final org.telegram.ui.Components.in0 f41421b;

    public re(org.telegram.ui.Components.in0 in0Var, int i10) {
        this.f41420a = i10;
        this.f41421b = in0Var;
    }

    @Override
    public final void run() {
        switch (this.f41420a) {
            case 0:
                org.telegram.ui.Components.in0 in0Var = this.f41421b;
                if (!in0Var.M) {
                    in0Var.M = true;
                    in0Var.c(new org.telegram.ui.Components.gn0(in0Var, 0), false);
                    in0Var.f27405s.invalidate();
                    return;
                }
                return;
            default:
                this.f41421b.dismiss();
                return;
        }
    }
}
