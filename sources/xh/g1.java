package xh;
public final class g1 implements Runnable {
    public final int f51482a;
    public final i1 f51483b;
    public final boolean f51484c;

    public g1(i1 i1Var, boolean z10, int i10) {
        this.f51482a = i10;
        this.f51483b = i1Var;
        this.f51484c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51482a) {
            case 0:
                boolean z10 = this.f51484c;
                i1 i1Var = this.f51483b;
                if (!z10) {
                    i1Var.G.setVisibility(8);
                    return;
                } else {
                    i1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f51484c;
                i1 i1Var2 = this.f51483b;
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
