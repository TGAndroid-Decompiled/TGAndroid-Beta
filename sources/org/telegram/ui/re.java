package org.telegram.ui;
public final class re implements Runnable {
    public final int f37042a;
    public final org.telegram.ui.Components.nm0 f37043b;

    public re(org.telegram.ui.Components.nm0 nm0Var, int i10) {
        this.f37042a = i10;
        this.f37043b = nm0Var;
    }

    @Override
    public final void run() {
        switch (this.f37042a) {
            case 0:
                org.telegram.ui.Components.nm0 nm0Var = this.f37043b;
                if (!nm0Var.M) {
                    nm0Var.M = true;
                    nm0Var.c(new org.telegram.ui.Components.lm0(nm0Var, 0), false);
                    nm0Var.f26732s.invalidate();
                    return;
                }
                return;
            default:
                this.f37043b.dismiss();
                return;
        }
    }
}
