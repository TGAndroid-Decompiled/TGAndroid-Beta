package org.telegram.ui;
public final class se implements Runnable {
    public final int f41068a;
    public final org.telegram.ui.Components.ym0 f41069b;

    public se(org.telegram.ui.Components.ym0 ym0Var, int i10) {
        this.f41068a = i10;
        this.f41069b = ym0Var;
    }

    @Override
    public final void run() {
        switch (this.f41068a) {
            case 0:
                org.telegram.ui.Components.ym0 ym0Var = this.f41069b;
                if (!ym0Var.M) {
                    ym0Var.M = true;
                    ym0Var.c(new org.telegram.ui.Components.wm0(ym0Var, 0), false);
                    ym0Var.f32707s.invalidate();
                    return;
                }
                return;
            default:
                this.f41069b.dismiss();
                return;
        }
    }
}
