package org.telegram.ui;
public final class y61 implements Runnable {
    public final int f39797a;
    public final z61 f39798b;

    public y61(z61 z61Var, int i10) {
        this.f39797a = i10;
        this.f39798b = z61Var;
    }

    @Override
    public final void run() {
        switch (this.f39797a) {
            case 0:
                z61.a(this.f39798b);
                return;
            default:
                this.f39798b.dismiss();
                return;
        }
    }
}
