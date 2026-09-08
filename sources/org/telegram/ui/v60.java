package org.telegram.ui;
public final class v60 implements Runnable {
    public final int f41455a;
    public final f70 f41456b;

    public v60(f70 f70Var, int i10) {
        this.f41455a = i10;
        this.f41456b = f70Var;
    }

    @Override
    public final void run() {
        switch (this.f41455a) {
            case 0:
                this.f41456b.finishFragment();
                return;
            case 1:
                f70 f70Var = this.f41456b;
                f70Var.i0();
                f70Var.e0();
                return;
            case 2:
                f70 f70Var2 = this.f41456b;
                f70Var2.getClass();
                f70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                f70 f70Var3 = this.f41456b;
                f70Var3.f36322n.postOnAnimation(new v60(f70Var3, 1));
                return;
        }
    }
}
