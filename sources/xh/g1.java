package xh;
public final class g1 implements Runnable {
    public final int f46192a;
    public final j1 f46193b;
    public final boolean f46194c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f46192a = i10;
        this.f46193b = j1Var;
        this.f46194c = z10;
    }

    @Override
    public final void run() {
        switch (this.f46192a) {
            case 0:
                boolean z10 = this.f46194c;
                j1 j1Var = this.f46193b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f46194c;
                j1 j1Var2 = this.f46193b;
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
