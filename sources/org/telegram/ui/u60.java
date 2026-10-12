package org.telegram.ui;
public final class u60 implements Runnable {
    public final int f42376a;
    public final e70 f42377b;

    public u60(e70 e70Var, int i10) {
        this.f42376a = i10;
        this.f42377b = e70Var;
    }

    @Override
    public final void run() {
        switch (this.f42376a) {
            case 0:
                this.f42377b.finishFragment();
                return;
            case 1:
                e70 e70Var = this.f42377b;
                e70Var.i0();
                e70Var.e0();
                return;
            case 2:
                e70 e70Var2 = this.f42377b;
                e70Var2.getClass();
                e70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                e70 e70Var3 = this.f42377b;
                e70Var3.f37012n.postOnAnimation(new u60(e70Var3, 1));
                return;
        }
    }
}
