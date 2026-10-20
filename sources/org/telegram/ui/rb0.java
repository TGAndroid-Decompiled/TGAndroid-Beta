package org.telegram.ui;
public final class rb0 implements Runnable {
    public final int f41112a;
    public final nc0 f41113b;
    public final boolean f41114c;

    public rb0(nc0 nc0Var, boolean z10, int i10) {
        this.f41112a = i10;
        this.f41113b = nc0Var;
        this.f41114c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41112a) {
            case 0:
                boolean z10 = this.f41114c;
                nc0 nc0Var = this.f41113b;
                if (!z10) {
                    nc0Var.f39500b.setVisibility(8);
                    return;
                } else {
                    nc0Var.getClass();
                    return;
                }
            default:
                this.f41113b.r0(this.f41114c);
                return;
        }
    }
}
