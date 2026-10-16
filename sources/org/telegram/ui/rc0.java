package org.telegram.ui;
public final class rc0 implements Runnable {
    public final int f39472a;
    public final ld0 f39473b;
    public final boolean f39474c;

    public rc0(ld0 ld0Var, boolean z10, int i10) {
        this.f39472a = i10;
        this.f39473b = ld0Var;
        this.f39474c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39472a) {
            case 0:
                boolean z10 = this.f39474c;
                ld0 ld0Var = this.f39473b;
                if (!z10) {
                    ld0Var.f37685b.setVisibility(8);
                    return;
                } else {
                    ld0Var.getClass();
                    return;
                }
            default:
                this.f39473b.r0(this.f39474c);
                return;
        }
    }
}
