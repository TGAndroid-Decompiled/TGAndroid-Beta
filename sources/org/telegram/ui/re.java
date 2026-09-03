package org.telegram.ui;
public final class re implements Runnable {
    public final int f37807a;
    public final org.telegram.ui.Components.hm0 f37808b;

    public re(org.telegram.ui.Components.hm0 hm0Var, int i10) {
        this.f37807a = i10;
        this.f37808b = hm0Var;
    }

    @Override
    public final void run() {
        switch (this.f37807a) {
            case 0:
                org.telegram.ui.Components.hm0 hm0Var = this.f37808b;
                if (!hm0Var.J) {
                    hm0Var.J = true;
                    hm0Var.c(new org.telegram.ui.Components.fm0(hm0Var, 0), false);
                    hm0Var.f25454s.invalidate();
                    return;
                }
                return;
            default:
                this.f37808b.dismiss();
                return;
        }
    }
}
