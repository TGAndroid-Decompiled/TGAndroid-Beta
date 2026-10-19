package org.telegram.ui;
public final class rb0 implements Runnable {
    public final int f41106a;
    public final nc0 f41107b;
    public final boolean f41108c;

    public rb0(nc0 nc0Var, boolean z10, int i10) {
        this.f41106a = i10;
        this.f41107b = nc0Var;
        this.f41108c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41106a) {
            case 0:
                boolean z10 = this.f41108c;
                nc0 nc0Var = this.f41107b;
                if (!z10) {
                    nc0Var.f39494b.setVisibility(8);
                    return;
                } else {
                    nc0Var.getClass();
                    return;
                }
            default:
                this.f41107b.r0(this.f41108c);
                return;
        }
    }
}
