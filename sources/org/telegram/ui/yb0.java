package org.telegram.ui;

public final class yb0 implements Runnable {

    public final int f44763a;

    public final tc0 f44764b;

    public final boolean f44765c;

    public yb0(tc0 tc0Var, boolean z10, int i10) {
        this.f44763a = i10;
        this.f44764b = tc0Var;
        this.f44765c = z10;
    }

    @Override
    public final void run() {
        switch (this.f44763a) {
            case 0:
                boolean z10 = this.f44765c;
                tc0 tc0Var = this.f44764b;
                if (!z10) {
                    tc0Var.f42857b.setVisibility(8);
                } else {
                    tc0Var.getClass();
                }
                break;
            default:
                this.f44764b.s0(this.f44765c);
                break;
        }
    }
}
