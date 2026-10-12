package org.telegram.ui;
public final class sc0 implements Runnable {
    public final int f40058a;
    public final nd0 f40059b;
    public final boolean f40060c;

    public sc0(nd0 nd0Var, boolean z10, int i10) {
        this.f40058a = i10;
        this.f40059b = nd0Var;
        this.f40060c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40058a) {
            case 0:
                boolean z10 = this.f40060c;
                nd0 nd0Var = this.f40059b;
                if (!z10) {
                    nd0Var.f38649b.setVisibility(8);
                    return;
                } else {
                    nd0Var.getClass();
                    return;
                }
            default:
                this.f40059b.r0(this.f40060c);
                return;
        }
    }
}
