package org.telegram.ui;
public final class se implements Runnable {
    public final int f41677a;
    public final org.telegram.ui.Components.gn0 f41678b;

    public se(org.telegram.ui.Components.gn0 gn0Var, int i10) {
        this.f41677a = i10;
        this.f41678b = gn0Var;
    }

    @Override
    public final void run() {
        switch (this.f41677a) {
            case 0:
                org.telegram.ui.Components.gn0 gn0Var = this.f41678b;
                if (!gn0Var.M) {
                    gn0Var.M = true;
                    gn0Var.c(new org.telegram.ui.Components.en0(gn0Var, 0), false);
                    gn0Var.f26822s.invalidate();
                    return;
                }
                return;
            default:
                this.f41678b.dismiss();
                return;
        }
    }
}
