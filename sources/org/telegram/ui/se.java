package org.telegram.ui;
public final class se implements Runnable {
    public final int f41106a;
    public final org.telegram.ui.Components.ym0 f41107b;

    public se(org.telegram.ui.Components.ym0 ym0Var, int i10) {
        this.f41106a = i10;
        this.f41107b = ym0Var;
    }

    @Override
    public final void run() {
        switch (this.f41106a) {
            case 0:
                org.telegram.ui.Components.ym0 ym0Var = this.f41107b;
                if (!ym0Var.M) {
                    ym0Var.M = true;
                    ym0Var.c(new org.telegram.ui.Components.wm0(ym0Var, 0), false);
                    ym0Var.f32714s.invalidate();
                    return;
                }
                return;
            default:
                this.f41107b.dismiss();
                return;
        }
    }
}
