package org.telegram.ui;
public final class se implements Runnable {
    public final int f36660a;
    public final org.telegram.ui.Components.km0 f36661b;

    public se(org.telegram.ui.Components.km0 km0Var, int i10) {
        this.f36660a = i10;
        this.f36661b = km0Var;
    }

    @Override
    public final void run() {
        switch (this.f36660a) {
            case 0:
                org.telegram.ui.Components.km0 km0Var = this.f36661b;
                if (!km0Var.M) {
                    km0Var.M = true;
                    km0Var.c(new org.telegram.ui.Components.im0(km0Var, 0), false);
                    km0Var.f24757s.invalidate();
                    return;
                }
                return;
            default:
                this.f36661b.dismiss();
                return;
        }
    }
}
