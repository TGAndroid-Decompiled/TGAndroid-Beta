package xh;
public final class g1 implements Runnable {
    public final int f49972a;
    public final i1 f49973b;
    public final boolean f49974c;

    public g1(i1 i1Var, boolean z10, int i10) {
        this.f49972a = i10;
        this.f49973b = i1Var;
        this.f49974c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49972a) {
            case 0:
                boolean z10 = this.f49974c;
                i1 i1Var = this.f49973b;
                if (!z10) {
                    i1Var.G.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f49974c;
                i1 i1Var2 = this.f49973b;
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
