package org.telegram.ui;
public final class s60 implements Runnable {
    public final int f37314a;
    public final c70 f37315b;

    public s60(c70 c70Var, int i10) {
        this.f37314a = i10;
        this.f37315b = c70Var;
    }

    @Override
    public final void run() {
        switch (this.f37314a) {
            case 0:
                this.f37315b.finishFragment();
                return;
            case 1:
                c70 c70Var = this.f37315b;
                c70Var.i0();
                c70Var.e0();
                return;
            case 2:
                c70 c70Var2 = this.f37315b;
                c70Var2.getClass();
                c70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                c70 c70Var3 = this.f37315b;
                c70Var3.f32551n.postOnAnimation(new s60(c70Var3, 1));
                return;
        }
    }
}
