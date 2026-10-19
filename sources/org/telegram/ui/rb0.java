package org.telegram.ui;
public final class rb0 implements Runnable {
    public final int f41114a;
    public final nc0 f41115b;
    public final boolean f41116c;

    public rb0(nc0 nc0Var, boolean z10, int i10) {
        this.f41114a = i10;
        this.f41115b = nc0Var;
        this.f41116c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41114a) {
            case 0:
                boolean z10 = this.f41116c;
                nc0 nc0Var = this.f41115b;
                if (!z10) {
                    nc0Var.f39498b.setVisibility(8);
                    return;
                } else {
                    nc0Var.getClass();
                    return;
                }
            default:
                this.f41115b.r0(this.f41116c);
                return;
        }
    }
}
