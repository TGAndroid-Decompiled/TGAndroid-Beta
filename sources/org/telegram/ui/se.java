package org.telegram.ui;
public final class se implements Runnable {
    public final int f41350a;
    public final org.telegram.ui.Components.ol0 f41351b;

    public se(org.telegram.ui.Components.ol0 ol0Var, int i10) {
        this.f41350a = i10;
        this.f41351b = ol0Var;
    }

    @Override
    public final void run() {
        switch (this.f41350a) {
            case 0:
                org.telegram.ui.Components.ol0 ol0Var = this.f41351b;
                if (!ol0Var.M) {
                    ol0Var.M = true;
                    ol0Var.c(new org.telegram.ui.Components.ml0(ol0Var, 0), false);
                    ol0Var.f29169s.invalidate();
                    return;
                }
                return;
            default:
                this.f41351b.dismiss();
                return;
        }
    }
}
