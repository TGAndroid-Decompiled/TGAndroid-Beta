package org.telegram.ui;
public final class vb0 implements Runnable {
    public final int f43498a;
    public final rc0 f43499b;
    public final boolean f43500c;

    public vb0(rc0 rc0Var, boolean z10, int i10) {
        this.f43498a = i10;
        this.f43499b = rc0Var;
        this.f43500c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43498a) {
            case 0:
                boolean z10 = this.f43500c;
                rc0 rc0Var = this.f43499b;
                if (!z10) {
                    rc0Var.f42034b.setVisibility(8);
                    return;
                } else {
                    rc0Var.getClass();
                    return;
                }
            default:
                this.f43499b.s0(this.f43500c);
                return;
        }
    }
}
