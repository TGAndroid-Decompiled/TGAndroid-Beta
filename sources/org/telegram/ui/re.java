package org.telegram.ui;
public final class re implements Runnable {
    public final int f37197a;
    public final org.telegram.ui.Components.bm0 f37198b;

    public re(org.telegram.ui.Components.bm0 bm0Var, int i10) {
        this.f37197a = i10;
        this.f37198b = bm0Var;
    }

    @Override
    public final void run() {
        switch (this.f37197a) {
            case 0:
                org.telegram.ui.Components.bm0 bm0Var = this.f37198b;
                if (!bm0Var.M) {
                    bm0Var.M = true;
                    bm0Var.c(new org.telegram.ui.Components.zl0(bm0Var, 0), false);
                    bm0Var.f22771s.invalidate();
                    return;
                }
                return;
            default:
                this.f37198b.dismiss();
                return;
        }
    }
}
