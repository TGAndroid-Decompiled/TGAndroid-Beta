package org.telegram.ui;
public final class tb0 implements Runnable {
    public final int f42942a;
    public final pc0 f42943b;
    public final boolean f42944c;

    public tb0(pc0 pc0Var, boolean z10, int i9) {
        this.f42942a = i9;
        this.f42943b = pc0Var;
        this.f42944c = z10;
    }

    @Override
    public final void run() {
        switch (this.f42942a) {
            case 0:
                boolean z10 = this.f42944c;
                pc0 pc0Var = this.f42943b;
                if (!z10) {
                    pc0Var.f41443b.setVisibility(8);
                    return;
                } else {
                    pc0Var.getClass();
                    return;
                }
            default:
                this.f42943b.r0(this.f42944c);
                return;
        }
    }
}
