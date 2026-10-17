package org.telegram.ui;
public final class tb0 implements Runnable {
    public final int f41643a;
    public final pc0 f41644b;
    public final boolean f41645c;

    public tb0(pc0 pc0Var, boolean z10, int i10) {
        this.f41643a = i10;
        this.f41644b = pc0Var;
        this.f41645c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41643a) {
            case 0:
                boolean z10 = this.f41645c;
                pc0 pc0Var = this.f41644b;
                if (!z10) {
                    pc0Var.f40039b.setVisibility(8);
                    return;
                } else {
                    pc0Var.getClass();
                    return;
                }
            default:
                this.f41644b.r0(this.f41645c);
                return;
        }
    }
}
