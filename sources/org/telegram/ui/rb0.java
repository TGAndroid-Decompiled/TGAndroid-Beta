package org.telegram.ui;
public final class rb0 implements Runnable {
    public final int f41115a;
    public final nc0 f41116b;
    public final boolean f41117c;

    public rb0(nc0 nc0Var, boolean z10, int i10) {
        this.f41115a = i10;
        this.f41116b = nc0Var;
        this.f41117c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41115a) {
            case 0:
                boolean z10 = this.f41117c;
                nc0 nc0Var = this.f41116b;
                if (!z10) {
                    nc0Var.f39503b.setVisibility(8);
                    return;
                } else {
                    nc0Var.getClass();
                    return;
                }
            default:
                this.f41116b.r0(this.f41117c);
                return;
        }
    }
}
