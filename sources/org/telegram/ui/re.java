package org.telegram.ui;
public final class re implements Runnable {
    public final int f43120a;
    public final org.telegram.ui.Components.hn0 f43121b;

    public re(org.telegram.ui.Components.hn0 hn0Var, int i10) {
        this.f43120a = i10;
        this.f43121b = hn0Var;
    }

    @Override
    public final void run() {
        switch (this.f43120a) {
            case 0:
                org.telegram.ui.Components.hn0 hn0Var = this.f43121b;
                if (!hn0Var.M) {
                    hn0Var.M = true;
                    hn0Var.c(new org.telegram.ui.Components.fn0(hn0Var, 0), false);
                    hn0Var.f29024s.invalidate();
                    return;
                }
                return;
            default:
                this.f43121b.dismiss();
                return;
        }
    }
}
