package org.telegram.ui;
public final class t60 implements Runnable {
    public final int f40720a;
    public final d70 f40721b;

    public t60(d70 d70Var, int i10) {
        this.f40720a = i10;
        this.f40721b = d70Var;
    }

    @Override
    public final void run() {
        switch (this.f40720a) {
            case 0:
                this.f40721b.finishFragment();
                return;
            case 1:
                d70 d70Var = this.f40721b;
                d70Var.i0();
                d70Var.e0();
                return;
            case 2:
                d70 d70Var2 = this.f40721b;
                d70Var2.getClass();
                d70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                d70 d70Var3 = this.f40721b;
                d70Var3.f35694n.postOnAnimation(new t60(d70Var3, 1));
                return;
        }
    }
}
