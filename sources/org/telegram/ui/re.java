package org.telegram.ui;
public final class re implements Runnable {
    public final int f37202a;
    public final org.telegram.ui.Components.bm0 f37203b;

    public re(org.telegram.ui.Components.bm0 bm0Var, int i10) {
        this.f37202a = i10;
        this.f37203b = bm0Var;
    }

    @Override
    public final void run() {
        switch (this.f37202a) {
            case 0:
                org.telegram.ui.Components.bm0 bm0Var = this.f37203b;
                if (!bm0Var.M) {
                    bm0Var.M = true;
                    bm0Var.c(new org.telegram.ui.Components.zl0(bm0Var, 0), false);
                    bm0Var.f22774s.invalidate();
                    return;
                }
                return;
            default:
                this.f37203b.dismiss();
                return;
        }
    }
}
