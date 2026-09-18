package org.telegram.ui;
public final class y61 implements Runnable {
    public final int f39802a;
    public final z61 f39803b;

    public y61(z61 z61Var, int i10) {
        this.f39802a = i10;
        this.f39803b = z61Var;
    }

    @Override
    public final void run() {
        switch (this.f39802a) {
            case 0:
                z61.a(this.f39803b);
                return;
            default:
                this.f39803b.dismiss();
                return;
        }
    }
}
