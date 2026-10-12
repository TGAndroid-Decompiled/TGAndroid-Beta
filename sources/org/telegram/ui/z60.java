package org.telegram.ui;
public final class z60 implements Runnable {
    public final int f42497a;
    public final j70 f42498b;

    public z60(j70 j70Var, int i10) {
        this.f42497a = i10;
        this.f42498b = j70Var;
    }

    @Override
    public final void run() {
        switch (this.f42497a) {
            case 0:
                this.f42498b.finishFragment();
                return;
            case 1:
                j70 j70Var = this.f42498b;
                j70Var.i0();
                j70Var.e0();
                return;
            case 2:
                j70 j70Var2 = this.f42498b;
                j70Var2.getClass();
                j70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                j70 j70Var3 = this.f42498b;
                j70Var3.f37285n.postOnAnimation(new z60(j70Var3, 1));
                return;
        }
    }
}
