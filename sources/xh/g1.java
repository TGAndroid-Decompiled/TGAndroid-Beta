package xh;
public final class g1 implements Runnable {
    public final int f46150a;
    public final j1 f46151b;
    public final boolean f46152c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f46150a = i10;
        this.f46151b = j1Var;
        this.f46152c = z10;
    }

    @Override
    public final void run() {
        switch (this.f46150a) {
            case 0:
                boolean z10 = this.f46152c;
                j1 j1Var = this.f46151b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f46152c;
                j1 j1Var2 = this.f46151b;
                if (!z11) {
                    j1Var2.v.setVisibility(8);
                    return;
                } else {
                    j1Var2.getClass();
                    return;
                }
        }
    }
}
