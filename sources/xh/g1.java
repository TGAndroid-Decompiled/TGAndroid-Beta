package xh;
public final class g1 implements Runnable {
    public final int f46171a;
    public final j1 f46172b;
    public final boolean f46173c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f46171a = i10;
        this.f46172b = j1Var;
        this.f46173c = z10;
    }

    @Override
    public final void run() {
        switch (this.f46171a) {
            case 0:
                boolean z10 = this.f46173c;
                j1 j1Var = this.f46172b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f46173c;
                j1 j1Var2 = this.f46172b;
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
