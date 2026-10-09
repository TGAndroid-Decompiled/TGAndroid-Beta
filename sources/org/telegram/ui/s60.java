package org.telegram.ui;
public final class s60 implements Runnable {
    public final int f41589a;
    public final c70 f41590b;

    public s60(c70 c70Var, int i10) {
        this.f41589a = i10;
        this.f41590b = c70Var;
    }

    @Override
    public final void run() {
        switch (this.f41589a) {
            case 0:
                this.f41590b.finishFragment();
                return;
            case 1:
                c70 c70Var = this.f41590b;
                c70Var.i0();
                c70Var.e0();
                return;
            case 2:
                c70 c70Var2 = this.f41590b;
                c70Var2.getClass();
                c70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                c70 c70Var3 = this.f41590b;
                c70Var3.f36559n.postOnAnimation(new s60(c70Var3, 1));
                return;
        }
    }
}
