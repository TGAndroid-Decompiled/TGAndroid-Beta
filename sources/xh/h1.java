package xh;
public final class h1 implements Runnable {
    public final int f51259a;
    public final j1 f51260b;
    public final boolean f51261c;

    public h1(j1 j1Var, boolean z10, int i10) {
        this.f51259a = i10;
        this.f51260b = j1Var;
        this.f51261c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51259a) {
            case 0:
                boolean z10 = this.f51261c;
                j1 j1Var = this.f51260b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f51261c;
                j1 j1Var2 = this.f51260b;
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
