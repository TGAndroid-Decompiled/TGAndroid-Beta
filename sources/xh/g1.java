package xh;
public final class g1 implements Runnable {
    public final int f49956a;
    public final i1 f49957b;
    public final boolean f49958c;

    public g1(i1 i1Var, boolean z10, int i10) {
        this.f49956a = i10;
        this.f49957b = i1Var;
        this.f49958c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49956a) {
            case 0:
                boolean z10 = this.f49958c;
                i1 i1Var = this.f49957b;
                if (!z10) {
                    i1Var.G.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f49958c;
                i1 i1Var2 = this.f49957b;
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
