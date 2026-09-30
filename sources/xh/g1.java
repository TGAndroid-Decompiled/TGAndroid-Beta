package xh;
public final class g1 implements Runnable {
    public final int f46153a;
    public final j1 f46154b;
    public final boolean f46155c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f46153a = i10;
        this.f46154b = j1Var;
        this.f46155c = z10;
    }

    @Override
    public final void run() {
        switch (this.f46153a) {
            case 0:
                boolean z10 = this.f46155c;
                j1 j1Var = this.f46154b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f46155c;
                j1 j1Var2 = this.f46154b;
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
