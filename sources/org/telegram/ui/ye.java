package org.telegram.ui;
public final class ye implements Runnable {
    public final int f42143a;
    public final org.telegram.ui.Components.cn0 f42144b;

    public ye(org.telegram.ui.Components.cn0 cn0Var, int i10) {
        this.f42143a = i10;
        this.f42144b = cn0Var;
    }

    @Override
    public final void run() {
        switch (this.f42143a) {
            case 0:
                org.telegram.ui.Components.cn0 cn0Var = this.f42144b;
                if (!cn0Var.M) {
                    cn0Var.M = true;
                    cn0Var.c(new org.telegram.ui.Components.an0(cn0Var, 0), false);
                    cn0Var.f24146s.invalidate();
                    return;
                }
                return;
            default:
                this.f42144b.dismiss();
                return;
        }
    }
}
