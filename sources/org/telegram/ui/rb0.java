package org.telegram.ui;
public final class rb0 implements Runnable {
    public final int f41116a;
    public final nc0 f41117b;
    public final boolean f41118c;

    public rb0(nc0 nc0Var, boolean z10, int i10) {
        this.f41116a = i10;
        this.f41117b = nc0Var;
        this.f41118c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41116a) {
            case 0:
                boolean z10 = this.f41118c;
                nc0 nc0Var = this.f41117b;
                if (!z10) {
                    nc0Var.f39504b.setVisibility(8);
                    return;
                } else {
                    nc0Var.getClass();
                    return;
                }
            default:
                this.f41117b.r0(this.f41118c);
                return;
        }
    }
}
