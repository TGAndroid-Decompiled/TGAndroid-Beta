package xh;
public final class g1 implements Runnable {
    public final int f49957a;
    public final i1 f49958b;
    public final boolean f49959c;

    public g1(i1 i1Var, boolean z10, int i10) {
        this.f49957a = i10;
        this.f49958b = i1Var;
        this.f49959c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49957a) {
            case 0:
                boolean z10 = this.f49959c;
                i1 i1Var = this.f49958b;
                if (!z10) {
                    i1Var.G.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f49959c;
                i1 i1Var2 = this.f49958b;
                if (!z11) {
                    i1Var2.v.setVisibility(8);
                    return;
                } else {
                    i1Var2.getClass();
                    return;
                }
        }
    }
}
