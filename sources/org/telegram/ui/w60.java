package org.telegram.ui;
public final class w60 implements Runnable {
    public final int f38574a;
    public final g70 f38575b;

    public w60(g70 g70Var, int i10) {
        this.f38574a = i10;
        this.f38575b = g70Var;
    }

    @Override
    public final void run() {
        switch (this.f38574a) {
            case 0:
                this.f38575b.finishFragment();
                return;
            case 1:
                g70 g70Var = this.f38575b;
                g70Var.i0();
                g70Var.e0();
                return;
            case 2:
                g70 g70Var2 = this.f38575b;
                g70Var2.getClass();
                g70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                g70 g70Var3 = this.f38575b;
                g70Var3.f33883n.postOnAnimation(new w60(g70Var3, 1));
                return;
        }
    }
}
