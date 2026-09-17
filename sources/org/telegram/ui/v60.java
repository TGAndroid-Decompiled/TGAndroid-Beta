package org.telegram.ui;
public final class v60 implements Runnable {
    public final int f41456a;
    public final f70 f41457b;

    public v60(f70 f70Var, int i10) {
        this.f41456a = i10;
        this.f41457b = f70Var;
    }

    @Override
    public final void run() {
        switch (this.f41456a) {
            case 0:
                this.f41457b.finishFragment();
                return;
            case 1:
                f70 f70Var = this.f41457b;
                f70Var.i0();
                f70Var.e0();
                return;
            case 2:
                f70 f70Var2 = this.f41457b;
                f70Var2.getClass();
                f70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                f70 f70Var3 = this.f41457b;
                f70Var3.f36323n.postOnAnimation(new v60(f70Var3, 1));
                return;
        }
    }
}
