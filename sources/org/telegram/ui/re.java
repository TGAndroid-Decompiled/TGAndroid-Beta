package org.telegram.ui;
public final class re implements Runnable {
    public final int f37124a;
    public final org.telegram.ui.Components.mm0 f37125b;

    public re(org.telegram.ui.Components.mm0 mm0Var, int i10) {
        this.f37124a = i10;
        this.f37125b = mm0Var;
    }

    @Override
    public final void run() {
        switch (this.f37124a) {
            case 0:
                org.telegram.ui.Components.mm0 mm0Var = this.f37125b;
                if (!mm0Var.M) {
                    mm0Var.M = true;
                    mm0Var.c(new org.telegram.ui.Components.km0(mm0Var, 0), false);
                    mm0Var.f26424s.invalidate();
                    return;
                }
                return;
            default:
                this.f37125b.dismiss();
                return;
        }
    }
}
