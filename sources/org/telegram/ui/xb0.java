package org.telegram.ui;
public final class xb0 implements Runnable {
    public final int f43560a;
    public final sc0 f43561b;
    public final boolean f43562c;

    public xb0(sc0 sc0Var, boolean z10, int i10) {
        this.f43560a = i10;
        this.f43561b = sc0Var;
        this.f43562c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43560a) {
            case 0:
                boolean z10 = this.f43562c;
                sc0 sc0Var = this.f43561b;
                if (!z10) {
                    sc0Var.f41349b.setVisibility(8);
                    return;
                } else {
                    sc0Var.getClass();
                    return;
                }
            default:
                this.f43561b.s0(this.f43562c);
                return;
        }
    }
}
