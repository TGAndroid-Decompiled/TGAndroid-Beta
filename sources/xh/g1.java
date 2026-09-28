package xh;
public final class g1 implements Runnable {
    public final int f46151a;
    public final j1 f46152b;
    public final boolean f46153c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f46151a = i10;
        this.f46152b = j1Var;
        this.f46153c = z10;
    }

    @Override
    public final void run() {
        switch (this.f46151a) {
            case 0:
                boolean z10 = this.f46153c;
                j1 j1Var = this.f46152b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f46153c;
                j1 j1Var2 = this.f46152b;
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
