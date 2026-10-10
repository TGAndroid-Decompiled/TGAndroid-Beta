package xh;
public final class h1 implements Runnable {
    public final int f51305a;
    public final j1 f51306b;
    public final boolean f51307c;

    public h1(j1 j1Var, boolean z10, int i10) {
        this.f51305a = i10;
        this.f51306b = j1Var;
        this.f51307c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51305a) {
            case 0:
                boolean z10 = this.f51307c;
                j1 j1Var = this.f51306b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f51307c;
                j1 j1Var2 = this.f51306b;
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
