package org.telegram.ui;
public final class w60 implements Runnable {
    public final int f38579a;
    public final g70 f38580b;

    public w60(g70 g70Var, int i10) {
        this.f38579a = i10;
        this.f38580b = g70Var;
    }

    @Override
    public final void run() {
        switch (this.f38579a) {
            case 0:
                this.f38580b.finishFragment();
                return;
            case 1:
                g70 g70Var = this.f38580b;
                g70Var.i0();
                g70Var.e0();
                return;
            case 2:
                g70 g70Var2 = this.f38580b;
                g70Var2.getClass();
                g70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                g70 g70Var3 = this.f38580b;
                g70Var3.f33887n.postOnAnimation(new w60(g70Var3, 1));
                return;
        }
    }
}
