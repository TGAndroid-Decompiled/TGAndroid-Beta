package org.telegram.ui;
public final class se implements Runnable {
    public final int f41085a;
    public final org.telegram.ui.Components.ym0 f41086b;

    public se(org.telegram.ui.Components.ym0 ym0Var, int i10) {
        this.f41085a = i10;
        this.f41086b = ym0Var;
    }

    @Override
    public final void run() {
        switch (this.f41085a) {
            case 0:
                org.telegram.ui.Components.ym0 ym0Var = this.f41086b;
                if (!ym0Var.M) {
                    ym0Var.M = true;
                    ym0Var.c(new org.telegram.ui.Components.wm0(ym0Var, 0), false);
                    ym0Var.f32707s.invalidate();
                    return;
                }
                return;
            default:
                this.f41086b.dismiss();
                return;
        }
    }
}
