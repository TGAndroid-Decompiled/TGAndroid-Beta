package org.telegram.ui;
public final class tb0 implements Runnable {
    public final int f41634a;
    public final pc0 f41635b;
    public final boolean f41636c;

    public tb0(pc0 pc0Var, boolean z10, int i10) {
        this.f41634a = i10;
        this.f41635b = pc0Var;
        this.f41636c = z10;
    }

    @Override
    public final void run() {
        switch (this.f41634a) {
            case 0:
                boolean z10 = this.f41636c;
                pc0 pc0Var = this.f41635b;
                if (!z10) {
                    pc0Var.f40019b.setVisibility(8);
                    return;
                } else {
                    pc0Var.getClass();
                    return;
                }
            default:
                this.f41635b.r0(this.f41636c);
                return;
        }
    }
}
