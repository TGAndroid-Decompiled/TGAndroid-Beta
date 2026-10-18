package org.telegram.ui;
public final class tb0 implements Runnable {
    public final int f41669a;
    public final pc0 f41670b;
    public final boolean f41671c;

    public tb0(pc0 pc0Var, boolean z10, int i10) {
        this.f41669a = i10;
        this.f41670b = pc0Var;
        this.f41671c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41669a) {
            case 0:
                boolean z10 = this.f41671c;
                pc0 pc0Var = this.f41670b;
                if (!z10) {
                    pc0Var.f40058b.setVisibility(8);
                    return;
                } else {
                    pc0Var.getClass();
                    return;
                }
            default:
                this.f41670b.r0(this.f41671c);
                return;
        }
    }
}
