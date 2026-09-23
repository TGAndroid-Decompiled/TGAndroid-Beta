package org.telegram.ui;
public final class r60 implements Runnable {
    public final int f36701a;
    public final b70 f36702b;

    public r60(b70 b70Var, int i10) {
        this.f36701a = i10;
        this.f36702b = b70Var;
    }

    @Override
    public final void run() {
        switch (this.f36701a) {
            case 0:
                this.f36702b.finishFragment();
                return;
            case 1:
                b70 b70Var = this.f36702b;
                b70Var.i0();
                b70Var.e0();
                return;
            case 2:
                b70 b70Var2 = this.f36702b;
                b70Var2.getClass();
                b70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                b70 b70Var3 = this.f36702b;
                b70Var3.f31999n.postOnAnimation(new r60(b70Var3, 1));
                return;
        }
    }
}
