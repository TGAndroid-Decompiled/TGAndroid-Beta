package org.telegram.ui;
public final class re implements Runnable {
    public final int f42974a;
    public final org.telegram.ui.Components.in0 f42975b;

    public re(org.telegram.ui.Components.in0 in0Var, int i10) {
        this.f42974a = i10;
        this.f42975b = in0Var;
    }

    @Override
    public final void run() {
        switch (this.f42974a) {
            case 0:
                org.telegram.ui.Components.in0 in0Var = this.f42975b;
                if (!in0Var.M) {
                    in0Var.M = true;
                    in0Var.c(new org.telegram.ui.Components.gn0(in0Var, 0), false);
                    in0Var.f29395s.invalidate();
                    return;
                }
                return;
            default:
                this.f42975b.dismiss();
                return;
        }
    }
}
